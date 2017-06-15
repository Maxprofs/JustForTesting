package tw.leonchen.myproject.oop.method;

class Human{
	String name = "mike";
	
	public void sayHello(){
		System.out.println("Hola");
		sayGoodBye();
	}
	
	public void sayGoodBye(){
		System.out.println("Adios");
	}
}

public class CallTestActionEx2 {

	public static void main(String[] args) {
		Human superMan = new Human();
		superMan.sayHello();
		System.out.println("Ok");
	}

}
