package GUI;

import java.awt.CardLayout;
import CRUDGUI.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import Domain.*;
import Service.*;
import javax.swing.*;

public class Meniu_boli {
	
	private static String Afis(Vector<Boala> v) {
		String str="";
		String sir="ID  |NUME BOALA     \n";
		String linii="====================\n";
		str=linii+sir+linii;
		for(Boala b:v)
		 str=str+String.format("%4d|%-15s\n",b.getId(),b.getNume());
		
		str=str+linii;
		return str;
		
	}
	
	
	
	public static void Meniu(Service s) {
		JFrame f=new JFrame("Meniu boli");
		JButton b1=new JButton("Adaugare boala");
		JButton b2=new JButton("Modificare boala");
		JButton b3=new JButton("Sterge boala");
		
		/*
		JTextArea t=new JTextArea(Afis(s.GetB()));
		
		t.setEditable(false);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.add(sp);
		*/
		Tabel<Boala> tb=new TabelBoli(s.GetB());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(100, 100);
		f.add(sp);
		b1.setSize(140, 100);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			addBoala a=new addBoala("Adaugare boala","adauga",s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			upBoala a=new upBoala("Modificare boala","modifica",s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			delBoala a=new delBoala("Stergere boala","sterge",s);	
			}
		});
		
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(500,600);  
        f.setVisible(true); 
        
	}
}
