package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.Random;

class NumberGeneratorWithList implements Runnable {
    private AtomicIntegerArray buffer; // object that is shared across threads!
	private static Random generator;
    
	static {
		generator = new Random();
	}
	// constructor receives a reference to the buffer
	public NumberGeneratorWithList(AtomicIntegerArray buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            // random value from 1 - 100
			int randomValue = generator.nextInt(100) + 1;
            
			// add to the buffer
			this.buffer.set(randomValue);

			// put thread to sleep for 0-5 seconds
            int sleepTime = generator.nextInt(5000);
            System.out.printf("%s will sleep for %d milliseconds\n", Thread.currentThread().getName(), sleepTime);

			// put thread to sleep
			Thread.sleep(sleepTime); 
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class MainSynchronizedExample {
    

    public static void main(String[] args) {
        // construct the shared object
		// "An int array in which elements may be updated atomically."
       	AtomicIntegerArray sharedBuffer = new AtomicIntegerArray(10);

        // create two tasks to write to the shared SimpleArray
        NumberGeneratorWithList t1 = new NumberGeneratorWithList(sharedBuffer);
        NumberGeneratorWithList t2 = new NumberGeneratorWithList(sharedBuffer);

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(t1);
        executor.execute(t2);
        executor.shutdown();
    }
}