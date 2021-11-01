public class AnimalsApp {
	public static void main(String[] args) {
		System.out.println("HERE");
		Animal h = new Horse("CJ");
		System.out.println(h.speak());// "CJ says neigh"
		Animal c = new Cow("Bessie");
		System.out.println(c.speak()); // "Bessie says moooo"
		Animal s = new Sheep("Little Lamb");
		System.out.println(s.speak());// "Little Lamb says baaaa"
		// String sound = s.sound(); -> does this work ?
	}
}