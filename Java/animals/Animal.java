package animals;

public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public String speak() {
		return name + " says " + sound();
	}
	protected abstract String sound();
	public static void main(String[] args){
		System.out.println("Hello");
	}
}