package tw.leonchen.myproject.oop;

class Shirt{
	int price = 2000;
	char size = 'L';
}

public class CallTestReferenceEx1 {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		Shirt yourShirt = new Shirt();
		
		myShirt.price = 3000;
		myShirt.size = 'M';
		
		yourShirt.price = 5000;
		yourShirt.size = 'S';
		
		System.out.println("myShirt=" + myShirt);
		System.out.println("yourShirt=" + yourShirt);
		
		System.out.println("myShirt.price=" + myShirt.price);
		System.out.println("myShirt.size=" + myShirt.size);
		
		System.out.println("yourShirt.price=" + yourShirt.price);
		System.out.println("yourShirt.size=" + yourShirt.size);
	}

}
