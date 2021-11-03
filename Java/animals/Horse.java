javacpackage animals;
public class Horse extends Animal {
	public Horse (String name) {
		super(name);
	}
	
	@Override 
	protected String sound() {
		return "neigh";
	}
}