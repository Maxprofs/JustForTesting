package tw.leonchen.myproject.oop.io;

import java.io.File;

public class TestFileInfoEx2 {

	public static void main(String[] args) {
		File file1 = new File("c:/temp/test");
		String[] names = file1.list();
		
		for(String fileName: names){
			System.out.println(fileName);
			
			File file2 = new File(file1, fileName);
			file2.delete();
		}

	}

}
