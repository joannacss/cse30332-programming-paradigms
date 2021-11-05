package generics;

// imports the class that can generate random numbers
// Documentation : https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Raffle {
    private List<String> elements;
    
    public Raffle(){
        this.elements = new ArrayList<>();
    }
    public void addElement(String obj){
    	this.elements.add(obj);
    }
    public String draw() {
        Random r = new Random();
        int index = r.nextInt(elements.size());
        return this.elements.get(index);
    }

    public static void main(String [] args){
    	Raffle r = new Raffle();
    	// adds 10 strings "Person X"
    	for(int i = 1; i <= 10; i++)
    		r.addElement("Person " + i);
    	// randomly selects one string
    	String chosenOne = r.draw();
    	// prints out the selected string
    	System.out.println("The person randomly chosen is: " + chosenOne);
    }
}


