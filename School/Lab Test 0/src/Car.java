
public class Car {
	private String brand;
	private int power;
	private static int counter = 0;
	private static final int MAX_CARS = 10;
	
	Car(String brand, int power){
		
		if (counter <= MAX_CARS) {
			this.brand = brand;
			this.power = power;
			counter++;
		}else{
			System.out.println("Maximum number of cars reached");
		}
	}
	
	public static int getCounter(){
		return counter;
	}
	
		
	
	public static int maxPower(int car1, int car2, int car3){
		
		int max = car1;
		if (car2 > car1) {
			max = car2;
		}
		if(car3 > car2){
			max = car3;
		}
		return max;
	}

	public int getPower() {
		// TODO Auto-generated method stub
		return this.power;
	}
}
