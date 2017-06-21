package tw.joe.myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Words extends JFrame implements ActionListener{
	private static final long serialVersionUID=1L;
	public static void main(StringTest[] args) {
		new Words().setVisible(false);
	}
	public Words(){
		JFrame Layout=new JFrame("JFrame");
		Layout.setSize(400, 400);
		Layout.setResizable(false);
		Layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar bar= new JMenuBar();
		JMenu file= new JMenu("File");
		JMenuItem open=new JMenuItem("Open");
		JMenuItem save=new JMenuItem("Save");
		JMenuItem saves= new JMenuItem("Save as");
		JMenuItem extra= new JMenu("Extra");
		JMenuItem help= new JMenuItem("help");
		JMenuItem close= new JMenuItem("Exit");
		TextArea text=new TextArea("Text here");
		
		Layout.add(bar, BorderLayout.NORTH);
		Layout.add(text, BorderLayout.CENTER);
		bar.add(file);
		file.add(open);
		file.add(save);
		file.add(saves);
		file.add(extra);
			extra.add(help);
		file.addSeparator();
		file.add(close);
		close.addActionListener(this);
		Layout.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("Exit")){
				System.exit(0);
			/*}else if(e.getActionCommand().equals("Open")){
				open();
		}else if(e.getActionCommand().equals("Save")){
			save();*/
		}
	}
}
