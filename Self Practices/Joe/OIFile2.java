package tw.joe.myproject;

import java.io.*;

public class OIFile2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1 = new FileInputStream("c:/temp/test/source.txt");
		FileOutputStream file2 = new FileOutputStream("c:/temp/test/destination.txt", true);

		int data;
		while ((data = file1.read()) != -1) {
			System.out.print((char) data + "");
			file2.write(data);
		}
		file2.close();
		file1.close();
	}

}
