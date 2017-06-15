package tw.leonchen.myproject.oop.overload;

public class TestOverloadEx1 {

	public void move(){
		System.out.println("move");
	}
	
	public void move(int speed){
		System.out.println("move:" + speed + " km");
	}
	
	public boolean move(String destination, int distance){
		System.out.println("Dest:" + destination + " Distance:" + distance + " km");
		return true;
	}
	
	public static void main(String[] args) {
		TestOverloadEx1 overload1 = new TestOverloadEx1();
		overload1.move('A');
	}

}
