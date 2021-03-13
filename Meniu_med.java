package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import Domain.*;
import Service.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import CRUDGUI.*;

public class Meniu_med {
	
	private static String Afis(Vector<Medicament> v) {
		String str="";
		String sir="ID  |DATA       |NUME           |NUME BOALA     \n";
		String linii="===============================================\n";
		str=linii+sir+linii;
		for(Medicament m:v)
		 str=str+String.format("%4d|%-17s|%-15s\n",m.getId(),m.getNume(),m.getBoala());
		
		str=str+linii;
		return str;
		
	}

	public static void Meniu(Service s) {
		JFrame f=new JFrame("Meniu medicamente");
		JButton b1=new JButton("Adaugare medicament");
		JButton b2=new JButton("Modificare medicament");
		JButton b3=new JButton("Sterge medicament");
		/*
		JTextArea t=new JTextArea(Afis(s.GetM()));
		
		t.setEditable(false);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.add(sp);
		*/
		Tabel<Medicament> tb=new TabelMedicamente(s.GetM());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setDefaultEditor(Object.class, null);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
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
			addMed a=new addMed("Adaugare medicament","adauga",s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			upMed a=new upMed("Modifica medicament","modifica",s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			delMed a=new delMed("Sterge medicament","sterge",s);	
			}
		});
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(600,600);  
        f.setVisible(true); 
        
	}

	
	
}
