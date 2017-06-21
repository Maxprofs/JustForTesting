package tw.joe.myproject;

abstract class Company {

	public abstract void calFuel();

	public abstract void calDistance();

	public static void doTasks(Company corp) {
		corp.calDistance();
		corp.calFuel();
	}
	
}

class Truck extends Company {
	public void calFuel() {
		System.out.println("Fuel used: ");
	}

	public void calDistance() {
		System.out.println("Distance covered");
	}
}

class Ship extends Company {
	public void calFuel() {
		System.out.println("Fuel used: ");
	}

	public void calDistance() {
		System.out.println("Distance covered");
	}

	void Dives() {
		System.out.println("Dives");
	}
}

public class myabstractEx1 {
	public static void main(String[] args) {
		// corp = new Truck();
		// Company corp1 = new Truck();
		//
		// corp.calDistance();
		// corp.calFuel();
		//
		// Truck toyota = new Truck();
		// toyota.calDistance();
		// toyota.calFuel();
		// Truck Honda = new Truck();
		// Honda.calDistance();
		// Honda.calFuel();
		Company corp1=null;
		Company.doTasks(new Truck());
		Company.doTasks(new Ship());
		if (corp1 instanceof Ship) {
			Ship submarine = (Ship) corp1;
			submarine.Dives();
		}
	}
}
