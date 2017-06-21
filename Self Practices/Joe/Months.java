package tw.joe.myproject;

public class Months {

	public static void main(StringTest[] args) {
		int month=2;
		int year=1980;
		if(month==1 || month==3 || month==5 || month==7|| month==8 || month==10 || month==12){
			System.out.println(month+" has 31 days.");
		}else if(month==4 || month==6 || month==9 || month==11){
				System.out.println(month+" has 30 days.");
		}else if(month==2 ){
			if(year%4==0 && (year%100!=0 || year%400==0)){
				System.out.println(month+" has 29 days");	
			}else{
			System.out.println(month+" has 28 days");}
		}else{
			System.out.println("Invalid Month");
		}
		System.out.println("The End!");
	}

}
