package GUI;

import Domain.*;
import CRUDGUI.*;
import Service.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import CRUDGUI.addMed;


public class Meniu_consultatii {
	
	private static String Afis(Vector<Consultatie> v) {
		String str="";
		String sir="ID  |DATA       |NUME           |PRENUME        |NUME BOALA     |NUME MEDICAMENT\n";
		String linii="==================================================================\n";
		str=linii+sir+linii;
		for(Consultatie c:v)
		 str=str+String.format("%4d|%11s|%-15s|%-15s|%-15s|%-15s\n",c.getId(),c.getData(),c.getNume(),
					c.getPrenume(),c.getBoala(),c.getMedicament());
		
		str=str+linii;
		return str;
		
	}

	public static void Meniu(Service s) {
		JFrame f=new JFrame("Meniu consultatii");
		JButton b1=new JButton("Adaugare consultatie");
		JButton b2=new JButton("Modificare consultatie");
		JButton b3=new JButton("Sterge consultatie");
		/*
		JTextArea t=new JTextArea(Afis(s.GetC()));
		
		t.setEditable(false);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.add(sp);
		*/
		Tabel<Consultatie> tb=new TabelConsultatii(s.GetC());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(5).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		b1.setSize(140, 100);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			addConsultatie a=new addConsultatie("Adaugare onsultatie","adauga",s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			upConsultatie a=new upConsultatie("Modificare consultatie","modifica",s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			delConsultatie a=new delConsultatie("Stergere consultatie","sterge",s);	
			}
		});
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(550,550);  
        f.setVisible(true); 
	}

	
	
}
