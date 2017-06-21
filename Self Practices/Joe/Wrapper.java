package tw.joe.myproject;

public class Wrapper {

	public static void main(String[] args) {
		String data="123456";
		System.out.println("data+1="+ (data+1));
		
		int plusTwo=Integer.parseInt(data);
		System.out.println("data+1="+ (plusTwo+2));
	}

}
