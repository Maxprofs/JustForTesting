package method;
class Human{
	String name ="mike";
			public void sayhello(){
		System.out.println("Hola");
		sayGoodbye();
	}
			public void sayGoodbye(){
				System.out.println("Adios");
			}
}
public class CallTestActionEx2 {

	public static void main(String[] args) {
	Human superman = new Human();
	superman.sayhello();
	System.out.println("ok");

	}

}
