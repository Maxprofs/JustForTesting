package tw.leonchen.myproject.hw;

public class TestTriangleHw2 {

	public void showTriangle1(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=11-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void showTriangle2(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TestTriangleHw2 test1 = new TestTriangleHw2();
		test1.showTriangle1();
		test1.showTriangle2();			
	}

}
