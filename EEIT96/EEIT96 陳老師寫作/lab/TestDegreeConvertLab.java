package tw.leonchen.myproject.lab;

public class TestDegreeConvertLab {

	public static void main(String[] args) {
		int degree = 56;
		int index = 2;
		
		if(index==1){
			System.out.println("C->F");
			System.out.println("Degree F:" + (9/5.0*degree+32));
		}
		
		
		if(index==2){
			System.out.println("F->C");
			System.out.println("Degree C:" + ((degree-32)*5/9.0));
		}
	}

}
