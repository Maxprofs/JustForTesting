package tw.joe.myproject;
class Person{
	String name="mary";
	
	public void sayhello(){
		System.out.println("hi");
		sayGoodbye();
	}
	public void sayGoodbye(){
		System.out.println("bye");
	}
}
public class OOP {

	public static void main(StringTest[] args) {
		Person batMan=new Person();
		batMan.sayhello();
		System.out.println("ok");

	}

}
