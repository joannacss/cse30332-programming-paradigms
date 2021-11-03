package datastructures;


import java.util.HashSet;

public class CollectionsExampleHardcoded2{

	public static void main(String [] args){
		HashSet<String> set = new HashSet<>();
		set.add("A");
		set.add("X");
		set.add("Q");
		set.add("F");
		set.add("M");
		set.add("D");
		

		// DEMO: how can we make this print in order?
		// is there a way to do so with minimal changes to this code?
		for(String str: set)
			System.out.println(str);
	}
}


