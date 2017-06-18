package doitagain;

public class TestShiftOperatorEX1 {

	public static void main(String[] args) {
		int num1 = 1234;
		int num2 = -1234;
       
		System.out.print(num1+">>2"+(num1>>2));
		System.out.println(num2+">>2="+(num2>>2));
		System.out.println(num1+">>>2"+(num1>>>2));
		System.out.println(num2+"<<2"+(num2<<2));
		System.out.println(num1+"<<2"+(num1<<2));
	
	}

}
