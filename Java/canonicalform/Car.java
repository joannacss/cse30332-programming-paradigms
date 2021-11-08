package canonicalform;
enum CarColor{BLACK, SILVER, WHITE, GREEN, BLUE, RED, GOLD, BROWN, ORANGE}

public class Car{

	private String plate;
	private String state;
	private CarColor color;
	private String model;
	private String make;
	private int year;


	public Car(String plate, String state, CarColor color, String model, String make, int year) {
		this.plate = plate;
		this.state = state;
		this.color = color;
		this.model = model;
		this.make = make;
		this.year = year;
	}

	@Override
	public boolean equals(Object object) {

		if (this == object) return true;
		if (object == null) return false;
		if (getClass() != object.getClass()) return false;

		Car car = (Car) object;
		return plate.equals(car.plate) &&
				state.equals(car.state) &&
				color == car.color &&
				model.equals(car.model) &&
				make.equals(car.make);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), plate, state, color, model, make);
	}

	@Override
	public String toString() {
		return String.format(
				"plate=%s, state=%s, color=%s, model=%s, make=%s, year=%d",
				plate, state, color, model, make, year);
	}

	public static void main(String[] args) {
		Car c1 = new Car("123","NY", CarColor.GREEN, "Toyota","Corolla",2010);
		Car c2 = new Car("123","NY", CarColor.GREEN, "Toyota","Corolla",2010);
		Car c3 = new Car("456","IN", CarColor.BLUE, "Honda","Accord",2021);
		Car c4 = new Car("789","TX", CarColor.BLACK, "Honda","Accord",2021);

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c1 == c2 ? " + (c1 == c2));
		System.out.println("c1.equals(c2) ? " + c1.equals(c2));
	}
}