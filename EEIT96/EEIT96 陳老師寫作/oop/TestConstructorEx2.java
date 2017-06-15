package tw.leonchen.myproject.oop;

public class TestConstructorEx2 {

	public TestConstructorEx2(String name){
		System.out.println("hello," + name);
	}
	
	public void play(){
		System.out.println("Play BasketBall.");
	}
	
	public static void main(String[] args) {
		TestConstructorEx2 construct = new TestConstructorEx2("mike");
		construct.play();
		//construct.play();
		
		//anonymous object
		new TestConstructorEx2("judy").play();
		//new TestConstructorEx2("judy").play();	
		
		System.out.println("finished");
		
		int i=1;
		i=i+1;
		System.out.println("i=" + i);
		System.out.println("1+1=" + (1+1));
	}

}
