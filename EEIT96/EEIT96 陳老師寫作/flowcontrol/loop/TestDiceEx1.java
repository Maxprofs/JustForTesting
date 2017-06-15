package tw.leonchen.myproject.flowcontrol.loop;

public class TestDiceEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 3;

		while (true) {
			
			int richNum = (int) (Math.random() * 6) + 1;
			System.out.println("richNum=" + richNum);

			if (yourLuckyNumber == richNum) {
				System.out.println("You Win !!");
				break;
			} else {
				System.out.println("Try Again.");
			}

		}

	}

}
