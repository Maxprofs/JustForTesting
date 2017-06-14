package tw.leonchen.myproject.oop.polymorphism;

public class CallTestPolymorphismEx2 {

	public void processAction(Mammal m){  //Mammal m = new Cat();  //Mammal m = new Dog();
		m.eat();
	}
	
	public static void main(String[] args) {
		CallTestPolymorphismEx2 poly1 = new CallTestPolymorphismEx2();
		poly1.processAction(new Cat());
		poly1.processAction(new Dog());
	}

}
