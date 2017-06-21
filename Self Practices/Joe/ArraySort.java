
public class ArraySort {

	int[] data = { 5, 12, 7, 9, 26, 24, 35 };

	public void numberSort() {

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				int temp;
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		for (int k = 0; k < data.length; k++) {
			System.out.println("data " + k + ": " + data[k]);
		}
	}

	public void numberSort1() {
		while (true) {
			int count = 0;
			for (int m = 0; m < data.length - 1; m++) {
				int temp;
				if (data[m] > data[m + 1]) {
					temp = data[m];
					data[m] = data[m + 1];
					data[m + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		for (int a = 0; a < data.length; a++) {
			System.out.println("data " + a + ": " + data[a]);
		}

	}

	public static void main(String[] args) {
		ArraySort arraySort = new ArraySort();
		// arraySort.numberSort();
		arraySort.numberSort1();

	}

}
