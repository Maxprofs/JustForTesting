package tw.leonchen.myproject.oop.polymorphism;

class Mammal{
	public void eat(){
		System.out.println("i can eat something.");
	}
}

class Cat extends Mammal{

	@Override
	public void eat() {
		System.out.println("Cat eats Fish and Rat.");
	}
	
}

class Dog extends Mammal{

	@Override
	public void eat() {
		System.out.println("Dog eats Bone.");
	}
	
}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
		//Cat kitty = new Cat();
		//kitty.eat();
		
		//Mammal m = new Mammal();
		//m = kitty;
		
//		Mammal m1 = new Cat();
//		m1.eat();
//		
//		Mammal m2 = new Dog();
//		m2.eat();
		
		Mammal m;
		
		m = new Cat();
		m.eat();
		
		m = new Dog();
		m.eat();
	}

}
