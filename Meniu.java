package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Service.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Meniu {
	
	public static void Meniu_principal(Service s) {
		
		JFrame f=new JFrame("Meniu Pricnipal");
		JButton b1=new JButton("Boli");
		JButton b2=new JButton("Medicamente");
		JButton b3=new JButton("Pacienti");
		JButton b4=new JButton("Consultatii");
		JButton b5=new JButton("Rapoarte");
		b1.setSize(140, 100);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_boli.Meniu(s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_med.Meniu(s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_pacienti.Meniu(s);	
			}
		});
		b4.setSize(140, 40);
		f.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_consultatii.Meniu(s);	
			}
		});
		b5.setSize(140, 40);
		f.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.Meniu(s);	
			}
		});
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(300,150);  
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    /*
	public static void main(String[] args) {
		 Service s=new Service("Boli.txt","Medicamente.txt",
				"Pacienti.txt","Consultatii.txt");
		Meniu_principal(s);

	}

	*/
}
