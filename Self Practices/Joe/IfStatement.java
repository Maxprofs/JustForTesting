package tw.joe.myproject;

public class IfStatement {
/*
	public static void main(String[] args) {
		int degree=31;
		if(degree>=30){
			
			System.out.println("It's hot");
		}
		System.out.println("Keep writing Java");
	}
*/
/*	
	public static void main(String []args){
		int yournum=3;
		int dicenum=(int)(Math.random()*6+1);
		if(dicenum ==yournum){
			System.out.println("You Win!");
		}else{
			System.out.println("Try again");
		}
	
	}
*/
	public static void main(StringTest []args){
	int num=-4;
	if(num>=0){
		System.out.println(num+" is positive");
		if(num%2==0){
			System.out.println(num+" is even number");
		}else{
			System.out.println(num+" is odd number");
		}
	}else {
		System.out.println(num+" is negative");
		if(num%2==0){
			System.out.println(num+" is even number");
		}else{
			System.out.println(num+" is odd number");
		}
	}
		
	}
}
