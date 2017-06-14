package tw.leonchen.myproject.oop;

class Bike{
   private String location = "Taipei";
   
   public void showInfo(){
	  System.out.println(location);  
   }
}

public class TestEqualsEx1 {

	public static void main(String[] args) {
		Bike iBike = new Bike();
		Bike uBike = new Bike();
		
		System.out.println("(iBike==uBike)=" + (iBike==uBike));
		System.out.println("(iBike.equals(uBike))=" + (iBike.equals(uBike)));
		
		uBike = iBike;
		
		System.out.println("(iBike==uBike)_1=" + (iBike==uBike));
		System.out.println("(iBike.equals(uBike))_1=" + (iBike.equals(uBike)));
	}

}
