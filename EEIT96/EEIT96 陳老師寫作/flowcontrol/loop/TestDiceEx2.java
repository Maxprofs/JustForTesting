package tw.leonchen.myproject.flowcontrol.loop;

public class TestDiceEx2 {

	public static void main(String[] args) {
		int yourLuckyNumber = 3;

		int count=1;
		while (true) {
			
			int richNum = (int) (Math.random() * 6) + 1;
			System.out.println("richNum=" + richNum);

			if (yourLuckyNumber == richNum) {
				if(count==3){
					System.out.println("You Win !!");
					break;
				}
				count++;				
				
			} else {
				System.out.println("Try Again.");
			}

		}

	}

}
