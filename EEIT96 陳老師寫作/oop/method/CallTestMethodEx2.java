package tw.leonchen.myproject.oop.method;

class Calculator{
	
	public void plus(int x, int y){
		System.out.println("x+y=" + (x+y));
	}
	
	public void minus(int x, int y){
		System.out.println("x-y=" + (x-y));
	}
	
}

public class CallTestMethodEx2 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(3, 6);
		casio.minus(7, 5);
		System.out.println("success.");
	}

}
