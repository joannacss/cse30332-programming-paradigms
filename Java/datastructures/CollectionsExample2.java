package datastructures;
// DEMO: import statement
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CollectionsExample2{

    public static void main(String [] args){
        // DEMO: playing around with primitive wrappers
		int a = 2;
		Integer b = a;
        // DEMO: list of primitives (ex: int)
		List<Integer> myList = new ArrayList<>();
		myList.add(a);

        // DEMO: list of floats
		List<Float> myList2 = new ArrayList<>();

        // DEMO: map of <id: string>
        Map<Integer, String> myList3 = new HashMap<>();

    }
}