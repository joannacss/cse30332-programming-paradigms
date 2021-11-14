
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.io.IOException;

class FileParserTask implements Runnable {
    // TODO: implement
    // notice that an object of this class is instantiated as shown in the main method
    // (i.e., it receives a File and two Maps in the constructor.
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
            namesCount and occupationsCount are shared objects.
            Notice: the static type for the key is a String, and the value is a Number in both maps.
            Depending on the class you choose to use, you might get a race condition!
            Refer to the Homework's HINTs section
         */
        // key = First Name, value = total count
        Map<String, /* TODO Static Type for the Value */> namesCount = /* TODO: what is the right type here? */;
        // key = Ocupation, value = total count
        Map<String, /* TODO Static Type for the Value */> occupationsCount = /* TODO: what is the right type here? */;

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            String filename = String.format("ExportCSV(%d).csv", i);
            Runnable task = new FileParserTask(new File(filename), namesCount, occupationsCount);
            executor.execute(task);
        }
        // initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
        executor.shutdown();
        // blocks the main thread until all the threads have executed
        // OR if a time out of 10 minutes has happened
        executor.awaitTermination(10, TimeUnit.MINUTES);

        // prints the computed metrics (DO NOT CHANGE THE LINES BELOW)
        System.out.println("First Name\tTotal");
        namesCount.forEach((name, count) -> System.out.println(name + "\t" + count));

        System.out.println("Ocupation\tTotal");
        occupationCount.forEach((occupation, count) -> System.out.println(occupation + "\t" + count));
    }
}