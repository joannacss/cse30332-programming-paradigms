package multithreading;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

//DEMO: multiple tasks
public class PrintTaskDemo implements Runnable {
	int sleepTime ;
	String taskName;
	Random generator ;
	public PrintTaskDemo(String n){
		this.taskName = n;
		this.generator = new Random();
		this.sleepTime = generator.nextInt(5000);
	}

	@Override
	public void run(){
		System.out.printf("%s sleeps for %d milliseconds", taskName, sleepTime);
		try {
			Thread.sleep(sleepTime);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}	
}

class MainPrintTaskDemo {
    public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		

		Runnable p1 = new PrintTask("task 1");
		service.execute(p1);

		Runnable p2 = new PrintTask("task 2");
		service.execute(p2);

		Runnable p3 = new PrintTask("task 3");
		service.execute(p3);

		service.shutdown();
	
    }

}