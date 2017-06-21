package tw.joe.myproject;
class testthis{
	int colorRed=255;
	public void changecolor(int colorRed){
		this.colorRed=colorRed;
		System.out.println("this: "+this.colorRed);
	}
}
public class This {
	public static void main(StringTest[] args) {
		testthis change = new testthis();
		change.changecolor(100);
		System.out.println("change: "+change.colorRed);
		

	}

}
