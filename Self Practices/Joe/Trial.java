package tw.joe.myproject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Trial extends JFrame implements ActionListener{
	int i=1;
	private static final long serialVersionUID=1L;
	
	public static void main(String[] args) {
		new Trial().setVisible(true);
	}
	private Trial(){
		super("Test");
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		/*JFrame img1=new JFrame();
		img1.setSize(300, 225);
		add(img1, BorderLayout.CENTER);*/
		
		JButton button1=new JButton("Button 1");
		button1.setActionCommand("Click");
		button1.addActionListener(this);
		add(button1, BorderLayout.EAST);
		
		JButton button2=new JButton("Button 2");
		button2.setActionCommand("Button");
		button2.addActionListener(this);
		add(button2, BorderLayout.WEST);
		
		JMenuBar bar= new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem save= new JMenuItem("Save");
		JMenuItem close= new JMenuItem("Exit");
			close.addActionListener(this);
		JMenuItem extra= new JMenu("Extra");
		JMenuItem open=new JMenuItem("Open");
		JMenuItem hello=new JMenuItem("Hello");
		JMenuItem hello2=new JMenuItem("Hello2");
		
		
		file.add(newMenuItem);
		file.add(extra);
			extra.add(hello);
			extra.add(hello2);
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(close);
		bar.add(file);
		setJMenuBar(bar);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=e.getActionCommand();
		
		if(name.equals("Click")){
			System.out.println("Button 1 has been clicked");
		}else if(name.equals("Exit")){
			System.out.println("Closed");
			System.exit(0);
		}
		
	}
}
