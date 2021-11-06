package animals;
import java.util.HashSet;
import java.util.Set;

abstract class Pet{
	String name;
	Pet(String name){
		this.name = name;
	}
	public abstract void speak();
}

class Cat extends Pet {
	Cat(String name){
		super(name);
	}
	@Override
	public void speak() {
		System.out.println("meow");
	}
}

public class LowerBoundExample {
	public static void main(String[] args){
		// Using <? Super Sheep> we can add cat to sets of Cat, Pet, or Objects 
		// i.e., any set that is a supertype of Pet.
		Set<? super Cat> s1 = new HashSet<Object>();
		Set<? super Cat> s2 = new HashSet<Pet>();
		Set<? super Cat> s3 = new HashSet<Cat>();
		Cat cat = new Cat("Rafe");
		s1.add(cat);
		s2.add(cat);
		s3.add(cat);
	}
}