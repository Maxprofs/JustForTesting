package tw.joe.myproject;

import java.io.File;
import java.io.IOException;

public class IOFile {
	public void fileKeys() throws IOException {
		File file1 = new File("c:/Users/Student/Desktop/hello.txt");
		boolean status = file1.exists();
		System.out.println(status);
		if (status) {
			file1.delete();
		} else {
			file1.createNewFile();
		}
		File file2=new File("c:/Users/Student/Desktop/pig");
		file2.mkdir();
		System.out.println(file1.getName());
		System.out.println(file1.getUsableSpace());
		System.out.println(file1.getTotalSpace());
	}

	public static void main(String[] args) throws IOException {
		IOFile print=new IOFile();
		print.fileKeys();
		// File file2 = new
		// File("c:/Users/Student/Desktop/Trash/Bin/hello.txt");
		// file2.mkdirs();

		// File file3 = new File("C:\\Users\\Student\\Desktop\\Download");
		// String[] list = file3.list();
		// for (String print : list) {
		// System.out.println(print);
		// }

	}

}
