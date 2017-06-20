package tw.leonchen.myproject.oop.myabstract;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
	
	public static void processTask(Company corp){
		corp.calFuel();
		corp.calDistance();
	}
}

class Truck extends Company{
	public void calFuel(){
		System.out.println("Truck calculates Fuel.");
	}
	
	public void calDistance(){
		System.out.println("Truck calculates Distance.");
	}
}

class Ship extends Company{

	@Override
	public void calFuel() {
		System.out.println("Ship calculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Distance.");
	}
	
	public void dive(){
		System.out.println("Ship dives.");
	}
	
}


public class CallTestAbstractClassEx1 {
	
	public static void main(String[] args) {
//		Truck toyota = new Truck();
//		toyota.calFuel();
//		toyota.calDistance();
//		
//		Truck mitsubishi = new Truck();
//		mitsubishi.calFuel();
//		mitsubishi.calDistance();
		
//		Company corp;		
//		corp = new Truck();
//		corp.calFuel();
//		corp.calDistance();
//		
//		corp = new Ship();
//		corp.calFuel();
//		corp.calDistance();
		
//		if(corp instanceof Ship){
//			Ship warShip = (Ship)corp;
//			warShip.dive();
//		}
		
		Company.processTask(new Truck());
		Company.processTask(new Ship());
	}

}
