import javax.swing.*;
import javax.tools.Tool;

import java.awt.Color;
import java.awt.event.*;

class Start implements ActionListener
{
	int u1,u2;
	JFrame f1;
	JLabel l,lauthor;
	JButton b; 
	public Start()
	{
		
        
       
    
		l=new JLabel("WELCOME TO CHAUSAR");
		lauthor=new JLabel("-by Napster");
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLayout(null);
		//f1.getContentPane().setBackground( Color.BLUE );
		//JLabel background = new JLabel(new ImageIcon("chausar.jpeg"));
		
       

		f1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		b=new JButton("START");
		l.setBounds(200,150,200,50);
		b.setBounds(220,200,100,30);
		lauthor.setBounds(350,250,150,20);
		f1.add(l);
		f1.add(b);
		f1.add(lauthor);
		b.addActionListener(this);
	}
	public  void actionPerformed(ActionEvent ae) 
	{
	
		f1.dispose();
	}
	public static void main(String args[])
	{
		new Start();
	}
}