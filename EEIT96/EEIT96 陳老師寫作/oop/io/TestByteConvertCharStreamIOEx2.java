package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Secret:(use Q or q to exit)");

		InputStream is = System.in;
		InputStreamReader isr1 = new InputStreamReader(is);
		BufferedReader br1 = new BufferedReader(isr1);

		BufferedWriter bw1 = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("c:/temp/test/secret.txt")));

		String data;
		while ((data = br1.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				System.out.println("bye bye.");
				bw1.close();
				br1.close();
				isr1.close();
				is.close();
				System.exit(-1);
			}
			System.out.println("data:" + data);
			bw1.write(data);
			bw1.newLine();
		}

	}

}
