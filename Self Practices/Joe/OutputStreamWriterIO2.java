package tw.joe.myproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OutputStreamWriterIO2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Yes bitch, how can I help you! Input Q to get out");
		InputStream stream = System.in;
		InputStreamReader streamReader = new InputStreamReader(stream);
		BufferedReader bufferReader = new BufferedReader(streamReader);
		
		String data;
		while((data=bufferReader.readLine())!=null){
			if(data.equalsIgnoreCase("Q")){
				System.out.println("Up&Out");
				bufferReader.close();
				streamReader.close();
				stream.close();
				System.exit(-1);
			}
			System.out.println("OS: "+data);
			File fileCheck=new File(data);
			if(fileCheck.exists()){
				System.out.println("File Exists!");
			}else{
				System.out.println("File Not Found!");
			}
			
		}
		
	}

}
