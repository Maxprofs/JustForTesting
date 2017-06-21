package tw.joe.myproject;
class fetch{
	public int count(int x){
		int num = 2*x+1;
		return num;
	}
	public boolean count1(int y){
		int num1=2*y-10;
		if(num1 <=0){
			boolean value=true;
		return value ;
	}else{
		boolean value=false;
		return value;
	}
}}
public class Return {
	public static void main(StringTest[] args) {
		fetch take = new fetch();
		int answer=take.count(4);
		System.out.println(answer);
		
		boolean value1=take.count1(2);
		System.out.println("It is " + value1+" that it's small than zero");
		
	}
}
