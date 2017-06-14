package tw.leonchen.myproject.oop;

class Bird{
	public Bird(){
		System.out.println("I am a blue Bird.");
	}
	
	public Bird(String name){
		this();
		System.out.println("name=" + name);
	}
}


public class TestThisEx2 {

	public static void main(String[] args) {
		Bird bird = new Bird("angryBird");
		System.out.println("Happy.");
	}

}
