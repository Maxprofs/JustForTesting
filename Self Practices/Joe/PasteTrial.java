package tw.joe.myproject;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
public class PasteTrial {
		public static void main(StringTest[] args) {
			JFrame demo = new JFrame();
			demo.setSize(400, 400);
			demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel1;
			panel1=new JPanel();
			panel1.setLayout(new FlowLayout());
			
			JPanel panel2;
			panel2=new JPanel();
			panel2.setLayout(new FlowLayout());
			
			
			JCheckBox checkbox = new JCheckBox("JCheckBox");
			JRadioButton radiobutton = new JRadioButton("JRadiobutton");
			
			JButton button = new JButton("JButton");
			
			JLabel label = new JLabel("JLabel");
			label.setIcon(new ImageIcon("C:\\Users\\Student\\Desktop\\EEIT96\\HTML\\Images\\dog.jpg"));
			panel1.add(label);
			JTextArea textarea = new JTextArea("JTextArea");

			demo.getContentPane().add(BorderLayout.EAST, checkbox);
			demo.getContentPane().add(BorderLayout.WEST, radiobutton);
			demo.getContentPane().add(BorderLayout.SOUTH, button);
			demo.getContentPane().add(BorderLayout.NORTH, label);
			demo.getContentPane().add(BorderLayout.CENTER, textarea);

			demo.setVisible(true);
		}
	}
