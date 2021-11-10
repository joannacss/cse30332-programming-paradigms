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

    public NumberGeneratorTask(ArrayBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            // put thread to sleep for 0-5 seconds
            int sleepTime = new Random().nextInt(5000);
            System.out.printf("%s going to sleep for %d milliseconds.\n", Thread.currentThread().getName(), sleepTime);
            Thread.sleep(sleepTime); // put thread to sleep
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class MainSynchronizedExample {
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