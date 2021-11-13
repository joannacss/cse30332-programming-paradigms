package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;


class ArrayBuffer {
	private int[] buffer;
	private int currentSize;

	public ArrayBuffer(){
		this.buffer = new int[10];
		this.currentSize = 0;
	}

	public synchronized void add(int v){
		this.buffer[this.currentSize] = v;
		this.currentSize = (this.currentSize + 1) % 10;	
		System.out.printf("Thread %s added %d\n",
		Thread.currentThread().getName(), v);
	}
}

class NumberGeneratorTask implements Runnable {
	private ArrayBuffer buffer;
	// static generator
	private static Random generator = new Random(); // DEMO: initialization

	// static{
	// 	random = new Random();
	// }

	public NumberGeneratorTask(ArrayBuffer b){
		this.buffer = b;
	}

	public void run(){
		try{
			// generate random value
			int value = generator.nextInt(100) + 1;
			this.buffer.add(value);
			Thread.sleep(100);
			System.out.printf("Thread %s is going to sleep\n",
				Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.err.println(e.getMessage());
		}
	}
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        // construct the shared object
		ArrayBuffer shared = new ArrayBuffer();

        // create two tasks to write to the shared SimpleArray
		NumberGeneratorTask t1 = new NumberGeneratorTask(shared);
		NumberGeneratorTask t2 = new NumberGeneratorTask(shared);

        // execute the tasks with an ExecutorService
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(t1);
		service.execute(t2);

		service.shutdown();
    }
}