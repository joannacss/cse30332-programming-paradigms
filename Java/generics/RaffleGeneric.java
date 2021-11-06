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
    	RaffleGeneric<Integer> r = new RaffleGeneric<>();
    	// adds 10 strings "Person X"
    	for(int i = 1; i <= 10; i++)
    		r.addElement(i);
    	// randomly selects one string
    	Integer chosenOne = r.draw();
    	// prints out the selected string
    	System.out.println("The person randomly chosen is: " + chosenOne);
    }
}


