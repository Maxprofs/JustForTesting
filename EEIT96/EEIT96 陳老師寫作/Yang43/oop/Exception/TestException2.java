package Exception;

public class TestException2 {
	public void divide(int x, int y) throws ArithmeticException, Exception {
		System.out.println("x/y =" + (x / y));
	}

	public static void main(String[] args) {
		TestException2 except2 = new TestException2();
		try {
			except2.divide(6, 0);
		} catch (ArithmeticException e) {
			System.out.println("e1" + e);
		} catch (Exception e) {
			System.out.println("e2:" + e);
		}
	}

}
