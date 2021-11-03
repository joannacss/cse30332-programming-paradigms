package animals;
import java.util.Arrays;
import java.util.List;

abstract class Pet{
	String name;
	Pet(String name){
		this.name = name;
	}
	public abstract void speak();
}

class Dog extends Pet {
	Dog(String name){
		super(name);
	}
	@Override
	public void speak() {
		System.out.println("Woof");
	}
}
class Cat extends Pet {
	Cat(String name){
		super(name);
	}
	@Override
	public void speak() {
		System.out.println("Meow");
	}
}

public class AnimalChorusApp {
	// DEMO: why is that this does not work?
	public static void chorus(List<Animal> animals) {
		for (Animal animal: animals) 
			animal.speak();
	}
	public static void main(String[] args) {
		List<Cow> cows = Arrays.asList(new Cow("Bessie"));
		List<Sheep> sheep = Arrays.asList(new Sheep("Wooly"));
		chorus(cows);
		chorus(sheep);
	}
}
