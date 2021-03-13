package GUI;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Domain.Consultatie;
import Domain.Pacient;
import Service.*
;
public class Meniu_rapoarte {
	
	private static void rap1(Service s) {
		JFrame f=new JFrame("Sortare pacienti dupa nume");
		
		Tabel<Pacient> tb=new TabelPacienti(s.SortP());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,250);  
        f.setVisible(true); 
	}

	private static void rap2(Service s) {
		JFrame f=new JFrame("Pacientii consultati in ultima luna");
		
		Tabel<Pacient> tb=new TabelPacienti(s.rapp1());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,250);  
        f.setVisible(true);
	}
	
	public static void rap3(Service s) {
		//TODO interogare nume prenume pacient
		dialog d=new dialog(s);
		
	}
	
	private static void rap4(Service s) {
		JFrame f=new JFrame("Pacientii care nu au fost consultati luna curenta");
		
		Tabel<Pacient> tb=new TabelPacienti(s.rapp2());
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,250);  
        f.setVisible(true);
	}
	
	public static void rap01(Vector<Pacient> v) {
		JFrame f=new JFrame("0-1 ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap24(Vector<Pacient> v) {
		JFrame f=new JFrame("2-4 ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap510(Vector<Pacient> v) {
		JFrame f=new JFrame("5-10 ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap1118(Vector<Pacient> v) {
		JFrame f=new JFrame("11-18 ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap1959(Vector<Pacient> v) {
		JFrame f=new JFrame("19-59 ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap60(Vector<Pacient> v) {
		JFrame f=new JFrame("PESTE 60 DE ANI");
		
		Tabel<Pacient> tb=new TabelPacienti(v);
		JTable t=new JTable(tb.rowData,tb.columnNames);
		t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t.getColumnModel().getColumn(0).setPreferredWidth(15);
		t.getColumnModel().getColumn(4).setPreferredWidth(100);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(90, 100);
		f.add(sp);
		f.setSize(375,210);  
        f.setVisible(true);
	}
	
	public static void rap5(Service s) {
		//TODO meniu cu categorile de varsta
		// dupa apasarea unui buton se afisaza categoria de pacienti ceruta
		JFrame f=new JFrame("Clasificare pacienti dupa varsta");
		
		JButton b1=new JButton("0-1 ANI");
		JButton b2=new JButton("2-4 ANI");
		JButton b3=new JButton("5-10 ANI");
		JButton b4=new JButton("11-18 ANI");
		JButton b5=new JButton("19-59 ANI");
		JButton b6=new JButton("PESTE 60 DE ANI");
		b1.setSize(300, 40);
		b2.setSize(300, 40);
		b3.setSize(300, 40);
		b4.setSize(300, 40);
		b5.setSize(300, 40);
		b6.setSize(300, 40);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap01(s.Varste().get(0));	
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap24(s.Varste().get(1));	
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap510(s.Varste().get(2));	
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap1118(s.Varste().get(3));	
			}
		});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap1959(s.Varste().get(4));	
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap60(s.Varste().get(5));	
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.setLayout(new FlowLayout());
		
		f.setSize(375,110);  
        f.setVisible(true);
	}
	
	public static void Meniu(Service s) {
		JFrame f=new JFrame("Meniu rapoarte");
		JButton b1=new JButton("Sortare pacienti dupa nume");//raport1
		JButton b2=new JButton("Pacientii consultati in ultima luna");//raport2
		JButton b3=new JButton("Istoric boli si medicamente pt un pacient");//raport3
		JButton b4=new JButton("Pacientii care nu au fost consultati luna curenta");//raport4
		JButton b5=new JButton("Clasificare pacienti dupa varsta");//raport5
		b1.setSize(140, 100);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap1(s);	
			}
		});
		b2.setSize(140, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap2(s);	
			}
		});
		b3.setSize(140, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap3(s);	
			}
		});
		b4.setSize(140, 40);
		f.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
			Meniu_rapoarte.rap4(s);	
			}
		});
		b5.setSize(140, 40);
		f.add(b5);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Meniu_rapoarte.rap5(s);
			}
		});
		//f.add(Box.createVerticalBox());
		f.setLayout(new FlowLayout());
		f.setSize(350,250);  
        f.setVisible(true); 
        
	}

	
	
}
