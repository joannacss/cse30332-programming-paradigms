package multithreading.crawler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.nio.charset.Charset;
import java.net.URI;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Mocking a web crawler
 *
 * @author Joanna C. S. Santos (jdasilv2@nd.edu)
 */
public  class WebCrawler {

    //store the visited links (key is the Web link's address) <URL: status_code>
    protected Map<String, Integer> visitedUrls;
    //Web links queue
    protected Queue<String> queue;
    // Initial site (root Web URL)
    protected final String sitebase;
    // size of the thread pool
    public static int MAX_POOL_SIZE = 5;
    // pool of threads
    private final ThreadPoolExecutor threadPool;

    //    private final AtomicInteger counter;
    public WebCrawler(String sitebase) {
        this.sitebase = sitebase;
        this.visitedUrls = new ConcurrentHashMap<>(); //store the visited links
        this.queue = new ConcurrentLinkedDeque<>(); //Web links queue
        this.threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_POOL_SIZE);
//        this.counter = new AtomicInteger(0);
    }

    public void execute(String rootLink) {
        this.queue.add(rootLink); // initializes queue with root Web page

        do { //keeps iterating until the queue is empty, and all threads have finished their work
            if (!queue.isEmpty()) { // assign new tasks if there is any
//                counter.incrementAndGet();
                String currentUrl = queue.remove(); // dequeue
                TaskThread thread = new TaskThread(currentUrl, queue, visitedUrls);
                threadPool.execute(thread);
            }
        } while (/*counter.intValue() > 0 ||*/ !queue.isEmpty());
        threadPool.shutdown();

        printResults();

    }

    /**
     * Prints the results of the Web site inspections.
     * <p>
     * It will report all the broken links (i.e. status != 200)
     */
    public void printResults() {
        for (String key : visitedUrls.keySet()) {
            Integer statusCode = visitedUrls.get(key);
            // is link broken? (i.e., statusCode != 2xx).
            if (statusCode >= 200 && statusCode < 300) {
                System.out.printf("%s\t%d", key, visitedUrls.get(key));
            }
        }
    }

    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler("www.cse.nd.edu");
        crawler.execute("/");
    }

}


class TaskThread implements Runnable {
    private final int[] STATUS_CODES = new int[]{100, 200, 201, 204, 206, 301, 302, 303, 304, 307, 308, 401, 403, 404, 406, 407, 409, 410, 412, 416, 418, 425, 451, 500, 501, 502, 503, 504};
    private final String currentUrl;
    private final Random random;
    private final Queue<String> queue;
    private final Map<String, Integer> visitedUrls;

    public TaskThread(String currentUrl, Queue<String> queue, Map<String, Integer> visitedUrls) {
        this.currentUrl = currentUrl;
        this.random = new Random();
        this.queue = queue;
        this.visitedUrls = visitedUrls;
    }

    @Override
    public void run() {
        System.out.println("j");
        // generates a random HTTP status code response
        int randomIndex = random.nextInt(STATUS_CODES.length);
        int randomStatusCode = STATUS_CODES[randomIndex];
        this.visitedUrls.put(currentUrl, randomStatusCode);

        // randomly generates 0-2 new next links
        for (int i = 0; i < random.nextInt(3); i++) {
            String randomUrl = generateRandomUrl();
            // only adds if unvisited and the page is accessed using http
            if (!this.visitedUrls.containsKey(randomUrl)) {
                queue.add(randomUrl);
            }
        }


        counter.decrementAndGet();
    }

    // Based on: https://www.baeldung.com/java-random-string
    private String generateRandomUrl() {
        byte[] byteArray = new byte[7]; // length is bounded by 7
        random.nextBytes(byteArray);
        return new String(byteArray, Charset.forName("UTF-8")) + ".com";
    }
}

