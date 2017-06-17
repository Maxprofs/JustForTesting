package doitagain;

public class TestOperatorEx3 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k;
		k = (i++) + (j++);

		System.out.println("i=" + i);

		System.out.println("j=" + j);

		System.out.println("k=" + k);
	}
}
