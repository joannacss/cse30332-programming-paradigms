package shapes;
public class ShapesApp {
	public static void main(String[] args) {
		Shape r = new Rectangle(2,3);
		System.out.println(r.calculateArea());// 6.0
		Shape c = new Circle(4);
		System.out.println(c.calculateArea());// 4*4*PI = 50.26548245743669
		Shape t = new Triangle(4,5);
		System.out.println(t.calculateArea());// 10.0		
	}
}