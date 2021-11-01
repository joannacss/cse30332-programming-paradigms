package animals;
public class Sheep extends Animal {
	public Sheep (String name) {
		super(name);
	}
	
	@Override 
	protected String sound() {
		return "baaaa";
	}
}