package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Secret:(use Q or q to exit)");
		
		InputStream is = System.in;
		InputStreamReader isr1 = new InputStreamReader(is);
		BufferedReader br1 = new BufferedReader(isr1);
		
				String data;
		while((data = br1.readLine())!=null){
			if(data.equalsIgnoreCase("Q")){
				System.out.println("bye bye.");
				br1.close();
				isr1.close();
				is.close();
				System.exit(-1);
			}
			System.out.println("data:" + data);
		}	
        
	}

}
