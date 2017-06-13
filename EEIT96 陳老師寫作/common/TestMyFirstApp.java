package tw.leonchen.myproject.common;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * This is my First Java Application
 * @author LeonChen(陳奕兆)
 * @version v1.0
 *
 */

public class TestMyFirstApp {

	/**
	 * This is my Java Entry Point
	 * @param args String Data
	 */
	public static void main(String[] args) {
		System.out.println("Hola");
		
		JFrame f = new JFrame("title");
		f.add(new JButton("Press Me"));
		f.setSize(300, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
