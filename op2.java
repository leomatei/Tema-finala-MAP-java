package CRUDGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Service.Service;

public abstract class op2 extends JFrame implements ActionListener{

	static Service s;
	static JTextField[] t;
	static JFrame f;
	static JButton b;
	static JLabel l;
	
	public op2(String nume_fereastra,String nume_buton,Service s) {
		this.s=s;
		f=new JFrame(nume_fereastra);
		b=new JButton(nume_buton);
		b.addActionListener(this);
		
		
		
		
		f.show();
	}
	@Override
	public abstract void actionPerformed(ActionEvent arg0);
}
