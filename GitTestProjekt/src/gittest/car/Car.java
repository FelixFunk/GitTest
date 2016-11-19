package gittest.car;

public class Car {
	
	private int tank;
	final private int _verbrauch;
	
	public Car(int verbrauch){
		tank = 100;
		_verbrauch = verbrauch;
	}
	
	public void drive(int km){
		tank = tank - (_verbrauch*km);
		if(tank < 10) System.out.println("tank fast leer");
	}
	public void tanken() {
		tank = 100;
	}
}
