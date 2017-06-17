package hw;

public class TestTriangleHw2 {
	public void showTriangle1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("*");
		}
		System.out.println();
	}


public void showTriangle2(){
	for (int i=1;i<=10;i++){
		for(int j=1;j<=1;j++){
			System.out.println("*");
		}
System.out.println();
	}
}
public static void main(String[] args)
{
	TestTriangleHw2 test1 = new TestTriangleHw2();
	test1.showTriangle1();
	test1.showTriangle2();
}
}
