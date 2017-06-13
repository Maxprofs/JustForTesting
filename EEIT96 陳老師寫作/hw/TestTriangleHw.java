package tw.leonchen.myproject.hw;

public class TestTriangleHw {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			for(int j=1;j<=11-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
