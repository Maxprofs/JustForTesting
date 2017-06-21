package tw.joe.myproject;
class Function{
	public void plus(int x, int y){
		System.out.println("X+Y= "+(x=y));
	}
	public void minus(int x,int y){
		System.out.println("X-Y= "+(x-y));
	}
}
public class Calculator {

	public static void main(StringTest[] args) {
		Function casio=new Function();
		casio.plus(10,5);
		casio.minus(10, 5);

	}

}
