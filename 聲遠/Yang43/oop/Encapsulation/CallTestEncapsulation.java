package Encapsulation;

class Elevator{
	private int level =2;
	public String message ="Welcome";
}

public class CallTestEncapsulation {

	public static void main(String[] args) {
Elevator iiiElevator =new Elevator();
System.out.print("Message:"+iiiElevator.message);
iiiElevator.message ="see you again";
System.out.println("Message2:"+iiiElevator.message);


	}

}
