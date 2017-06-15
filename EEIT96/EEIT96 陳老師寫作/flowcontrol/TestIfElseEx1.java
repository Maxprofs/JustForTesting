package tw.leonchen.myproject.flowcontrol;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 6;
		
		int diceNum = (int)(Math.random()*6+1);
		System.out.println("diceNum=" + diceNum);

		if(yourLuckyNumber==diceNum){
			System.out.println("You Win.");
		}else{
			System.out.println("Try Again.");
		}
		
		System.out.println("finished");
	}

}
