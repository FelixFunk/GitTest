package gittest.car;

public class Car {
	
	
	final private int _verbrauch;
	private int tank;
	
	public Car(int verbrauch){
		tank = 100;
		_verbrauch = verbrauch;
	}
	
	public void drive(int km){
		int tank_delta = km*_verbrauch;
		if(tank - tank_delta < 10) {
			System.out.println("Sie sind " + (tank-10)/_verbrauch + "km gefahren");
			System.out.println("Das Tankvolumen betr�gt 10L, bitte tanken");
			tank = 10;
		}
		else {
			tank = tank - tank_delta;
			System.out.println("Sie sind " + km +"km gefahren");
			System.out.println("Das Tankvolumen betr�gt " + tank + "L");
		}
	}
	public void tanken() {
		tank = 100;
		System.out.println("Tanken erfolgreich. Das Tankvolumen betr�gt " + tank +"L");
	}
}
