package tw.joe.myproject;

class shirt{
		char size='M';
		int price=2000;
}
public class New {
	public static void main(StringTest[] args) {
		shirt myShirt=new shirt();
		shirt yourShirt=new shirt();
		
		myShirt.price=3000;
		myShirt.size='L';
		
		yourShirt.price=5000;
		yourShirt.size='S';
		
		//yourShirt=myShirt;
		
		System.out.println("My shirt size: "+ myShirt.size+". Price: "+myShirt.price+'\n'+myShirt);
		System.out.println("Your shirt size: "+ yourShirt.size+". Price: "+yourShirt.price+'\n'+yourShirt);
	}

}
