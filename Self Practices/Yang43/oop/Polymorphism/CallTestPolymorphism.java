package Polymorphism;
class Mammal{
	public void eat(){
		System.out.println("i can eat something");
	}
}
class Cat extends Mammal{
	@Override
	public void eat(){
		System.out.println("Cat eats fish and rat");
	}
	public void jumpAway(){
		System.out.println("Cat jumps away");
	}
}
class Dog extends Mammal{
	@Override
	public void eat(){
		System.out.println("Dog eats bones")
	}
	public void biteball(){
		System.out.println("Dog bites ball");
	}
}

public class CallTestPolymorphism {

	public static void main(String[] args) {
		Mammal m;
		m = new Cat();
		m.eat();
		m = new Dog();
		m.eat();

	}

}
