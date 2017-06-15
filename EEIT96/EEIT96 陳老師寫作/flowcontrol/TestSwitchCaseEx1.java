package tw.leonchen.myproject.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int level = 20;
		
		switch(level){
		   case 5:
			   System.out.println("stick");
			   break;
		   case 10:
			   System.out.println("short sword.");
			   break;
		   case 20:
			   System.out.println("pistal.");
			   //break;
		   case 30:
			   System.out.println("rifle.");
			   //break;
		   default:
			   System.out.println("hand.");
			   break;
		}
		
		System.out.println("finished");

	}

}
