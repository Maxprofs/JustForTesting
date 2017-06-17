package doitagain.loop;

public class TestIfElseEX1 {
public static void main(String[] args){
	int yourLuckyNumber = 6;
	int diceNum = (int)(Math.random()*6+1);
		System.out.println("diceNum="+diceNum);
			if(yourLuckyNumber ==diceNum){
				System.out.println("you win");
			}else{
					System.out.println("Try it again");
				}				
			}
}


