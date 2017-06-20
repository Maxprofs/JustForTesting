package tw.leonchen.myproject.oop.nestedclass;

class A{
	private String name = "mary";
	
	class B{
		public void action(){
			System.out.println("Sleep:" + name);
		}
	}
	
	public void processNested(){
		B b1 = new B();
		b1.action();
	}
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
       A a1 = new A();
       a1.processNested();
       
       A.B b2 = a1.new B();
       b2.action();
	}

}
