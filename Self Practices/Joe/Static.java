package tw.joe.myproject;
class Car{
	public static void speedUp(){
		System.out.println("Speed UP");
	}
	public void slowDown(){
		System.out.println("Slow DOWN");
	}
}
public class Static {
	@SuppressWarnings("static-access")
	public static void main(StringTest[] args) {
		Car.speedUp();
		Car toyota=new Car();
		toyota.slowDown();
		
		toyota.speedUp();

	}

}
