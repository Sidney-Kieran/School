
public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car("Opel", 30);
		Car car2 = new Car("Toyota", 20);
		Car car3 = new Car("Ram", 89);
		

		
		System.out.println(Car.getCounter());
		
		
		System.out.println(Car.maxPower(car1.getPower(), car2.getPower(), car3.getPower()));
	}

}
