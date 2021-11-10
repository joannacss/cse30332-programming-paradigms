package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;

public class ProducerConsumer {
    private BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(10);

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
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create consumer thread
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(r1);
        executor.execute(r2);
        executor.shutdown();
    }
}