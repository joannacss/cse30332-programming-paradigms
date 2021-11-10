package multithreading;

import java.util.concurrent.ConcurrentHashMap;

import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Queue;

class Producer implements Runnable {
    private Queue<String> queue = new ConcurrentLinkedDeque<>();
    protected Map<String, Integer> visitedUrls = new ConcurrentHashMap<>();
    private final Random random = new Random();


    public Queue<String> getQueue() {
        return queue;
    }

    public Map<String, Integer> getVisitedUrls() {
        return visitedUrls;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String randomUrl = generateRandomUrl();
                queue.add(randomUrl);
                System.out.println("Producer produced-" + randomUrl + " Current size " + queue.size());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Based on: https://www.baeldung.com/java-random-string
    private String generateRandomUrl() {
        byte[] byteArray = new byte[7]; // length is bounded by 7
        random.nextBytes(byteArray);
        String randomName = new String(byteArray, Charset.forName("UTF-8"));
        return String.format("www.%s.com", randomName);
    }

}

class Consumer implements Runnable {
    private final int[] STATUS_CODES = new int[]{100, 200, 201, 204, 206, 301, 302, 303, 304, 307, 308, 401, 403, 404, 406, 407, 409, 410, 412, 416, 418, 425, 451, 500, 501, 502, 503, 504};
    private final Random random;
    private final Queue<String> queue;
    private final Map<String, Integer> visitedUrls;

    public Consumer(Queue<String> queue, Map<String, Integer> visitedUrls) {
        this.random = new Random();
        this.queue = queue;
        this.visitedUrls = visitedUrls;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String currentUrl = queue.poll();
                // generates a random HTTP status code response
                int randomIndex = random.nextInt(STATUS_CODES.length);
                int randomStatusCode = STATUS_CODES[randomIndex];
                this.visitedUrls.put(currentUrl, randomStatusCode);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class MainBrokenLinkDetector {
    public static void main(String[] args) throws InterruptedException {
        Producer r1 = new Producer();
        Runnable r2 = new Consumer(r1.getQueue(), r1.getVisitedUrls());
        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(r1);
        executor.execute(r2);
        executor.shutdown();
    }
}