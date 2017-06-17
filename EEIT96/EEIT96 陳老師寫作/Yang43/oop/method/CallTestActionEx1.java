package method;

class Person {
	String name = "mary";

	public void sayhello() {
		System.out.println("bye");
	}

	public void saygoodbye() {
		System.out.println("bye");
	}

public class CallTestActionEx1 {

	public void main(String[] args) {
		Person superman = new Person();
		superman.sayhello();
		superman.saygoodbye();
System.out.println("ok");
	
	
}
