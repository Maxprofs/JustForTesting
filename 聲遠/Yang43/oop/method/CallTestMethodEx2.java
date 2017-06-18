package method;
class Calculator{
	public void plus(int x,int y){
		System.out.println("x+y="+(x+y));
	}
	public void minus(int x,int y){
		
		System.out.println("x-y="+(x-y));
		
	}
}
public class CallTestMethodEx2 {

	public static void main(String[] args) {
	Calculator casio = new Calculator();
	casio.plus(3, 7);
	casio.minus(8,4);
	System.out.println("success");
	}

}
