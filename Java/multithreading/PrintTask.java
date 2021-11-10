
package multithreading;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * Example reused and modified from Java Deitel & Deitel book (9th edition).
 * Fig. 26.3: PrintTask.java
 * PrintTask class sleeps for a random time from 0 to 5 seconds
 */
public class PrintTask implements Runnable {
    private final int sleepTime; // random sleep time for thread
    private final String taskName; // name of task
    private final static Random generator = new Random();

    // constructor
    public PrintTask(String name) {
        taskName = name; // set task name
        // pick random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000); // milliseconds
    } // end PrintTask constructor

    // method run contains the code that a thread will execute
    public void run() {
        try { // put thread to sleep for sleepTime amount of time
            System.out.printf("%s going to sleep for %d milliseconds.\n",
                    taskName, sleepTime);
            Thread.sleep(sleepTime); // put thread to sleep
        } catch (InterruptedException exception) {
            System.out.printf("%s %s\n", taskName,
                    "terminated prematurely due to interruption");
        }

        // print task name
        System.out.printf("%s done sleeping\n", taskName);
    } // end method run
} // end class PrintTask

class MainPrintTask {
    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new PrintTask("task1"));
            Thread t2 = new Thread(new PrintTask("task2"));
            System.out.println("Starting the two threads");
            t1.start();
            t2.start();
            System.out.println("This statement executes right away");
            t1.join();
            t2.join(); // waits for the threads to die.
            System.out.println("This statement only executes after all threads finish executing");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static void main(String[] args) {
//
//        Thread t1 = new Thread(new PrintTask("task1"));
//        Thread t2 = new Thread(new PrintTask("task2"));
//        System.out.println("Starting the executor");
//        ExecutorService threadExecutor = Executors.newCachedThreadPool();
//        threadExecutor.execute(t1);
//        threadExecutor.execute(t2);
//        threadExecutor.shutdown(); // it does not accept any more jobs & waits for the threads to finish.
//        System.out.println("End main");
//
//    }
}