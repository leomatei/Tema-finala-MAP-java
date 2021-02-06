package CRUDGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Service.Service;

public abstract class op extends JFrame implements ActionListener{

	static Service s;
	static JTextField t;
	static JFrame f;
	static JButton b;
	static JLabel l;
	
	public op(String nume_fereastra,String nume_buton,Service s) {
		this.s=s;
		f=new JFrame(nume_fereastra);
		b=new JButton(nume_buton);
		l = new JLabel("Da numele in format cvs"); 
		b.addActionListener(this);
		t=new JTextField(50);
		JPanel p=new JPanel();
		p.add(t);
		p.add(b);
		p.add(l);
		f.add(p);
		f.setSize(600,100);
		f.show();
	}
	@Override
	public abstract void actionPerformed(ActionEvent arg0);

}