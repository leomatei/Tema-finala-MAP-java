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

import CRUDGUI.upBoala;

public class Meniu_pacienti {
	
	private static String Afis(Vector<Pacient> v) {
		String str="";
		String sir="ID  |NUME           |PRENUME        |ADRESA         |DATA NASTERII       \n";
		String linii="============================================================\n";
		str=linii+sir+linii;
		for(Pacient p:v)
		 str=str+String.format("%4d|%-15s|%-15s|%-15s|%-20s\n",p.getId(),p.getNume(),p.getPrenume(),
					p.getAdresa(),p.getData_nasterii());
		
		str=str+linii;
		return str;
		
	}
	public static void Meniu(Service s) {
		JFrame f=new JFrame("Meniu pacienti");
		JButton b1=new JButton("Adaugare pacient");
		JButton b2=new JButton("Modificare pacient");
		JButton b3=new JButton("Sterge pacient");
		/*
		JTextArea t=new JTextArea(Afis(s.GetP()));
		
		t.setEditable(false);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.add(sp);
		*/
		Tabel<Pacient> tb=new TabelPacienti(s.GetP());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
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
			addPacient a=new addPacient("Adaugare pacient","adauga",s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			upPacient a=new upPacient("Modificare pacient","modifica",s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			delPacient a=new delPacient("Stergere pacient","sterge",s);	
			}
		});
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(550,550);  
        f.setVisible(true); 
        
	}

	
	
}
