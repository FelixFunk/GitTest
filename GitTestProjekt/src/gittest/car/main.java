package gittest.car;

public class main {
	
	public static void main(String[] args) {
		Car car = new Car(3);
		car.drive(10);
		car.drive(15);
		car.drive(50);
		car.tanken();
	}
}
