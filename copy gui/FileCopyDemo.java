import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class FileDemo extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JButton b1;
	FileDemo() {
		setVisible(true);
		setSize(500, 300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l1 = new JLabel("Source File: ");
		add(l1);
		tf1 = new JTextField(20);
		add(tf1);

		JLabel l2 = new JLabel("Destination File: ");
		add(l2);

		tf2 = new JTextField(20);
		add(tf2);

		b1 = new JButton("Copy File");
		add(b1);

		b1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae) {

	}	
}
class FileCopyDemo{
	public static void main(String args[]) {
		FileDemo f = new FileDemo();
		f.setVisible(true);
		f.setSize(500, 300);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
	