class Cow extends Animal {
	public Cow (String name) {
		super(name);
	}
	
	@Override 
	protected String sound() {
		return "moooo";
	}
}