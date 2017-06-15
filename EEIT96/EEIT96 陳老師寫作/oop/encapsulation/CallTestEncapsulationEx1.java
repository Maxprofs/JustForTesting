package tw.leonchen.myproject.oop.encapsulation;

class Elevator{
	private int level = 2;
	public String message = "Welcome";
}

public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		Elevator iiiElevator = new Elevator();
		//System.out.println("Level:" + iiiElevator.level);  //compile error
		System.out.println("Message1:" + iiiElevator.message);
		iiiElevator.message = "See You Agian.";
		System.out.println("Message2:" + iiiElevator.message);
	}

}
