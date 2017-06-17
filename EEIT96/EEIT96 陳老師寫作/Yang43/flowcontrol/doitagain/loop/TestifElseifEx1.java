package doitagain.loop;

public class TestifElseifEx1 {
public static void main(String[] args)
{
	int month =2;
	int year =2000;
	if (month ==1 ||month ==3||month==5||month==7||month==8||month==10||month==12)
	{
		System.out.println(month+"has 31 days.");
	}else if(month==2){
			if((year%400==0)||(year%4==0&&year%100!=0)){
				System.out.println(month+"has 29 days");
			}else{
				System.out.println(month+"has 28 days");
				}
	}else{
				System.out.println("Invalid month");
			}
	System.out.println("mission complete");
		}
}
