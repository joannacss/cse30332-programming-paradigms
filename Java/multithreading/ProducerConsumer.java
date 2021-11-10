package multithreading;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    private BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(10);
    private int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            bq.put(value++);
            System.out.println("Producer produced-" + value + " Current size " + bq.size());
            Thread.sleep(100);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            int val = bq.take();
            System.out.println("Consumer consumed-" + val);
            Thread.sleep(500);
        }
    }
}

class MainProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        // Object of a class that has both produce()
        // and consume() methods
        final ProducerConsumer pc = new ProducerConsumer();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(t1);
        executor.execute(t2);
        executor.shutdown();
    }
}