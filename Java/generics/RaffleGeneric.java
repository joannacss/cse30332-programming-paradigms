package generics;

// imports the class that can generate random numbers
// Documentation : https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class RaffleGeneric<T> {
    private List<T> elements;
    
    public RaffleGeneric(){
        this.elements = new ArrayList<>();
    }
    public void addElement(T obj){
    	this.elements.add(obj);
    }
    public T draw() {
        Random r = new Random();
        int index = r.nextInt(elements.size());
        return this.elements.get(index);
    }

    public static void main(String [] args){
    	RaffleGeneric<String> r1 = new RaffleGeneric<String>();
    	// adds 10 strings "Person X"
    	for(int i = 1; i <= 10; i++)
    		r1.addElement("Person " + i);
    	// randomly selects one string
    	String chosenOne = r1.draw();
    	// prints out the selected string
    	System.out.println("The person randomly chosen is: " + chosenOne);



        RaffleGeneric<Integer> r2 = new RaffleGeneric<Integer>();
        // adds 10 strings "Person X"
        for(int i = 1; i <= 10; i++)
            r2.addElement(i);
        // randomly selects one string
        Integer chosenInt = r2.draw();
        // prints out the selected string
        System.out.println("The number randomly chosen is: " + chosenInt);
    }
}


