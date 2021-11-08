package multithreading;

// Example from: https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
public class ThreadExample1 extends Thread {

    // run() method contains the code that is executed by the thread.
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadExample1();

        System.out.println("Starting thread...");
        thread.start();
    }
}