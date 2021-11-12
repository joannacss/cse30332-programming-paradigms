package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
class ArrayBuffer {
    private int buffer[];
    private int currentSize;

    public ArrayBuffer() {
        this.buffer = new int[10];
        this.currentSize = 0; // un-needed! WHY?!
    }

    public synchronized void add(int val) {
        this.buffer[currentSize] = val;
        this.currentSize = (currentSize + 1) % buffer.length;
        System.out.printf("%s adding %d to position %d\n", Thread.currentThread().getName(), val, currentSize);
    }

}

class NumberGeneratorTask implements Runnable {
    private ArrayBuffer buffer; // object that is shared across threads!
	private static Random generator = new Random();
    // constructor receives a reference to the buffer
	public NumberGeneratorTask(ArrayBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            // random value from 1 - 100
			int randomValue = generator.nextInt(100) + 1;
            
			// add to the buffer
			this.buffer.add(randomValue);

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
    private static ArrayBuffer sharedBuffer;

    public static void main(String[] args) {
        // construct the shared object
        ArrayBuffer sharedBuffer = new ArrayBuffer();

        // create two tasks to write to the shared SimpleArray
        NumberGeneratorTask t1 = new NumberGeneratorTask(sharedBuffer);
        NumberGeneratorTask t2 = new NumberGeneratorTask(sharedBuffer);

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(t1);
        executor.execute(t2);
        executor.shutdown();
    }
}