package Override;

class Parent {
	public void jog() {
		System.out.println("jog slow");
	}
}

class Child extends Parent{
	

public void jog(){
		System.out.println("jog faster and speed up");
	}
}
public class CallTestOverride {
  
    
	public static void main(String[] args) {
   Child mike = new Child();
   mike.jog();

	}
}
