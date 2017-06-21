package tw.joe.myproject;

public class MultiDimArray {

	public void method1() {
		int[][] data = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9, 10 } };
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("data[%d][%d]=%d\n", i, j, data[i][j]);
			}
		}
		System.out.println();
	}

	public void method2() {
		int[][] data = new int[2][];
		data[0] = new int[3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;

		data[1] = new int[5];
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		data[1][3] = 7;
		data[1][4] = 8;
		for (int y = 0; y < data.length; y++) {
			for (int z = 0; z < data[y].length; z++) {
				// System.out.printf("data[%d][%d]=%d\n", y, z, data[y][z]);
			}
		}
		for (int[] nums : data) {
			for (int values : nums) {
				System.out.println(values);
			}
		}
		System.out.println();
	}

	public void method3() {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int value : data) {
			System.out.println(value);
		}
	}

	public static void main(StringTest[] args) {
		MultiDimArray multiDimArray = new MultiDimArray();
		multiDimArray.method1();
		multiDimArray.method2();
		multiDimArray.method3();
	}
}
