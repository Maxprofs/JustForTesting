package tw.joe.myproject;

public class VarArgs {
	public void add(int... data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			total = total + data[i];
		}
		System.out.println("Total: " + total);
	}

	public static void main(StringTest[] args) {
		VarArgs varArgs = new VarArgs();
		varArgs.add(1, 2, 3);
		
		int[] data1={5,6,7,8,9};
		varArgs.add(data1);

	}

}
