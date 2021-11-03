package datastructures;
// DEMO: import statement
import java.util.Collection;

// Using * vs using fully qualified class name
public class CollectionsExample{

    public static void main(String [] args){
        // DEMO: list of strings
		List<String> myList = new ArrayList<>();

        // DEMO: set of strings
		Set<String> mySet = new HashSet<>();

        // DEMO: map of <id: string>
        Map<String, String> myMap = new HashMap<>();
        // DEMO: iterating over the collections
		for(String element: myList){}
		for(String element: mySet){}
		


        // DEMO: using an array of Students and TAs
        // WAIT? we cannot import classes from the default package!!!
    }
}