package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;


class Producer implements Runnable {
    
	private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
		try{
			// no synchronization needed will be needed
			int value = 0;
			while (true) {
				queue.put(value);
				System.out.printf("Produced=%d\n", value);
				value++;
				Thread.sleep(200);			
			}
		}catch(InterruptedException ex){
			System.err.println(ex.getMessage());
		}
    }
}

class Consumer implements Runnable{
	private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
		try{
			while (true) {
				int val = queue.take();
				System.out.printf("Consumer %s consumed-%d. Current size = %d\n", Thread.currentThread().getName(), val, queue.size());
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex){
			System.err.println(ex.getMessage());
		}
    }
}

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        // shared data structure (blocking queue. size = 10)
		BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(10);
		// producer
		Producer p = new Producer(bq);
		// consumers
		Consumer c1 = new Consumer(bq);
		Consumer c2 = new Consumer(bq);
        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(p);
		executor.execute(c1);
        executor.execute(c2);
    }
}
