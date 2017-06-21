package tw.joe.myproject;

public class Overload {
	public void move(){
		System.out.println("MOVE!");
	}
	public void move(int speed){
		System.out.println("Moving speed is " + speed);
	}
	public void move(String destination, int distance){
		System.out.println("You are going to "+destination+". and it is "+distance+" km away");
	}
	public static void main(String[] args) {
		Overload test= new Overload();
		test.move();
		test.move(30);
		test.move("Japan",365);
		test.move('A');

	}

}
