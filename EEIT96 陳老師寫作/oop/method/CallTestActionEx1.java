package tw.leonchen.myproject.oop.method;

class Person{
	String name = "mary";
	
	public void sayHello(){
		System.out.println("hi");
	}
	
	public void sayGoodBye(){
		System.out.println("bye");
	}
}

public class CallTestActionEx1 {

	public static void main(String[] args) {
		Person superMan = new Person();
		superMan.sayHello();
		superMan.sayGoodBye();
		System.out.println("Ok");
	}

}
