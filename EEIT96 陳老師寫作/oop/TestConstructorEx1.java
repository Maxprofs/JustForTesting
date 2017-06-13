package tw.leonchen.myproject.oop;

public class TestConstructorEx1 {

	public TestConstructorEx1(String name){
		System.out.println("hello," + name);
	}
	
	public static void main(String[] args) {
		TestConstructorEx1 construct = new TestConstructorEx1("mary");
		System.out.println("finished");
	}

}
