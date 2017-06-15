package tw.leonchen.myproject.flowcontrol.loop;

public class TestNestedForLoopEx1 {

	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) {

			for (int i = 1; i <= 10; i++) {
				System.out.print("@");
			}
			// System.out.println();
			System.out.print("\n");

		}
	}

}
