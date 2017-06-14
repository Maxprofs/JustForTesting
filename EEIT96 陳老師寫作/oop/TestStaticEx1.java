package tw.leonchen.myproject.oop;

class Car{
	public static void speedUp(){
		System.out.println("Faster");
	}
	
	public void slowDown(){
		System.out.println("Slower");
	}
}

public class TestStaticEx1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Car.speedUp();
		
		Car toyota = new Car();
		toyota.slowDown();
		toyota.speedUp();
	}

}
