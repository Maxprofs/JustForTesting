package tw.leonchen.myproject.oop;

public class TestThisEx1 {

	int colorRed = 255;
	
	public void changeColor(int colorRed){
		this.colorRed = colorRed;
		//System.out.println("this=" + this);
	}
	
	public static void main(String[] args) {
		TestThisEx1 test1 = new TestThisEx1();
		test1.changeColor(128);
		//System.out.println("test1=" + test1);
		
		System.out.println("test1.colorRed:" + test1.colorRed);
	}

}
