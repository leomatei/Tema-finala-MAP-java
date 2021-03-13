package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import Service.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Domain.Boala;
import Domain.Medicament;

public class dialog extends JFrame implements ActionListener {

	static Service s;
	static JTextField t;
	static JFrame f;
	static JButton b;
	
	private void getrap(String str) {
		//todo
		JFrame fr=new JFrame(str);
		String np[]=str.split(" ");
		Object[][] data=new Object[20][2];
		String[] cn= {"Boala","Medicamente"};
		Vector<Boala> vb=s.rap1(np[0], np[1]);
		Vector<Medicament> vm=s.rap2(np[0], np[1]);
		for(int i=0;i<vb.size();i++) {
			data[i][0]=vb.get(i).getNume();
			data[i][1]=vm.get(i).getNume();
		}
		
		JTable t=new JTable(data,cn);
		t.setDefaultEditor(Object.class, null);
		JScrollPane sp=new JScrollPane(t,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(100, 100);
		fr.add(sp);
		fr.setSize(300,300);
		fr.setVisible(true); 
	}
	
	public dialog(Service s) {
		this.s=s;
		f=new JFrame("Cauta pacient");
		b=new JButton("cauta");
		b.addActionListener(this);
		t=new JTextField(20);
		JPanel p=new JPanel();
		p.add(t);
		p.add(b);
		f.add(p);
		f.setSize(300,100);
		f.show();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("cauta")) getrap(t.getText());
			
		
		
	}
}
