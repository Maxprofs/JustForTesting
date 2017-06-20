package tw.leonchen.myproject.oop.nestedclass;

class E{
	private String career = "Runner";
	
	public void showInfo(){
		System.out.println("It's a nice day.");
	}
	
	public void processLocalNested(){
		int age = 18;
		class F{
			public void run(){
				System.out.println(career + " run at age:" + age);
				showInfo();
			}
		}
		F f1 = new F();
		f1.run();
	}
}

public class CallTestNestedClassEx3 {

	public static void main(String[] args) {
        E e1 = new E();
        e1.processLocalNested();
	}

}
