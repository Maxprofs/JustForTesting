package Polymorphism;

public class CallTestPolymorphism2 {
public void processAction(Mammal m){
	m.eat();
	if(m instanceof Cat){
		Cat c1 = (Cat)m;
		c1.jumpAway();
	}
if(m instanceof Dog){
	 Dog d1 =(Dog)m;
	 d1.biteball();
}
}
	public static void main(String[] args) {
	CallTestPolymorphism2 poly1 new CallTestPolymorphism2();
	poly1.processAction(new Cat());
	poly1.processAction(new Dog());
	

	}

}
