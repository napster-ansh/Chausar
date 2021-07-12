import java.awt.event.*;

import javax.swing.*;

class One implements ActionListener
{
	JFrame f;
	JButton b_start,b_quit;
	JLabel l;
	public One()
	{
		f=new JFrame("Chausar");
		f.setSize(900,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(null);
		
		l=new JLabel();
		l.setIcon(new ImageIcon("chausar.jpeg"));
		l.setBounds(0,-20,900,500);
		b_start=new JButton("Play");
		b_start.setBounds(400,300,100,30);
		b_quit=new JButton("Quit");
		b_quit.setBounds(400,350,100,30);
		
		f.add(b_start);
		f.add(b_quit);
		f.add(l);
		
		b_start.addActionListener(this);
		b_quit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b_start)
		{
			new Two();
			f.dispose();
		}
		else
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[])
	{
		new One();
	}
}