package tw.joe.myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReaderIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Yes bitch, how can I help you! Input Q to get out");
		
		InputStream stream = System.in;
		InputStreamReader streamReader = new InputStreamReader(stream);
		BufferedReader bufferReader = new BufferedReader(streamReader);
		
		BufferedWriter bufferWriter=(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/records.txt"))));
		
		String data;
		while((data=bufferReader.readLine())!=null){
			if(data.equalsIgnoreCase("Q")){
				System.out.println("Up&Out");
				bufferWriter.close();
				bufferReader.close();
				streamReader.close();
				stream.close();
				System.exit(-1);
			}
			System.out.println("OS: "+data);
			bufferWriter.write(data);
			bufferWriter.newLine();
		}
		
	}

}
