package tw.leonchen.myproject.oop.myinterface;

interface Flyer{
	public void takeOff();
	public void fly();
	public void land();
}

class Creature{
	public void eat(){
		System.out.println("Creature eats Food.");
	}
}

class AirPlane implements Flyer{

	@Override
	public void takeOff() {
        System.out.println("AirPlane takes Off.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flies.");
	}

	@Override
	public void land() {
		System.out.println("AirPlane lands.");
	}
	
}

class SuperMan extends Creature implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("SuperMan takes off.");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan flies.");
	}

	@Override
	public void land() {
		System.out.println("SuperMan lands.");
	}

	@Override
	public void eat() {
		System.out.println("SuperMan eats Steak and Meat.");
	}
	
	public void stopBullet(){
		System.out.println("SuperMan Stops Bullets.");
	}
	
}

public class CallTestInterfaceEx1 {

	public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		plane.takeOff();
		plane.fly();
		plane.land();
		
		SuperMan clark = new SuperMan();
		clark.takeOff();
		clark.fly();
		clark.land();
		clark.eat();
		clark.stopBullet();
	}

}
