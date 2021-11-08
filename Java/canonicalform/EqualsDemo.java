package canonicalform;
class Point {
	private int x;
	private int y;

	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	// Reflexive: a.equals(a) = true
	// Symetric: a.equals(b) = b.equals(a)
	// Transitive: a.equals(b) and b.equals(c) then a.equals(c)
	// Non-null: An object can never be equal to null; i.e., a.equals(null) is always false
    @Override
	public boolean equals(Object other){
		return false;
	}



}
public class EqualsDemo{

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,4);
		

		System.out.println("p1 == p2 ? " + (p1 == p2));
		System.out.println("p1.equals(p2) ? " + p1.equals(p2));
	}
}