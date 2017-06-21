package tw.joe.myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCharStreamIO {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/Reader.txt");

		boolean status = file1.exists();
		if (status == false) {
			file1.createNewFile();
		}

		FileReader fileRead = new FileReader(file1);
		FileWriter fileWrite = new FileWriter("c:/temp/test/Writer.txt");
		int data;

		while ((data = fileRead.read()) != -1) {
			System.out.print(data + " ");
			fileWrite.write(data);
		}

		BufferedReader bufferRead = new BufferedReader(fileRead);
		BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
		String data1;
		while((data1=bufferRead.readLine())!=null){
			System.out.print(data1);
			bufferWrite.write(data1);
		};
		
		bufferWrite.flush();
		bufferRead.close();
		bufferWrite.close();
		fileWrite.close();
		fileRead.close();
	}
}
