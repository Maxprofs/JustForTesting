package tw.leonchen.myproject.oop.override;

class Parent {
	public void jog() {
		System.out.println("Jog Slow.");
	}
}

class Child extends Parent {
	
	@Override
    public void jog(){
    	System.out.println("Jog Faster and speed up");
    }
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Child mike = new Child();
		mike.jog();
	}

}
