package tw.joe.myproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bufferIn = new BufferedInputStream(new FileInputStream("c:/temp/test/source.txt"));
		BufferedOutputStream bufferOut = new BufferedOutputStream(new FileOutputStream("c:/temp/test/bufferOut.txt"));
		// DataInputStream data1=new DataInputStream(new BufferedInputStream(new
		// FileInputStream("c:/temp/test/source.txt")));
		int data;
		while ((data = bufferIn.read()) != -1) {
			System.out.print((char) data + "");
			bufferOut.write(data);

		}
		bufferOut.flush();
		// data1.close();
		bufferOut.close();
		bufferIn.close();
	}
}
