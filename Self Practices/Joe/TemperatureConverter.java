package tw.joe.myproject;

public class TemperatureConverter {

	public static void main(StringTest[] args) {
		int temperature=30;
		int index= (int) (Math.random()*2+1);
		if (index==1){
			System.out.println("The temperature is "+ (temperature*9/5+32) + "°F");
		}else{
			System.out.println("The temperature is "+ temperature +"°C");
		}
		System.out.println("index = "+index);

	}

}
