package tw.leonchen.myproject.oop.io;

import java.io.File;
import java.io.IOException;

public class TestFileInfoEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/hello.txt");
		boolean status = file1.exists();
		System.out.println("status:" + status);
		
		if(status){
			file1.delete();
			System.out.println("File Deleted");
		}else{
			file1.createNewFile();
			System.out.println("File Created");
		}
		
		File file2 = new File("c:/temp/virus/welcome");
		file2.mkdirs();
	}

}
