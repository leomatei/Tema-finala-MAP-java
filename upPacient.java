package CRUDGUI;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Service.*;

public class upPacient extends op2{

	public upPacient(String s1, String s2, Service s)
	{
		super(s1,s2,s);
		l=new JLabel("introduceti id, nume, prenume, adresa,\n"
				+ "data nasterii in aceasta ordine\n"
				+ "data trebuie sa fie de forma yyyy-mm-dd\n");
		t=new JTextField[5];
		t[0]=new JTextField(50);
		t[1]=new JTextField(50);
		t[2]=new JTextField(50);
		t[3]=new JTextField(50);
		t[4]=new JTextField(50);
		
		JPanel p=new JPanel();
		p.add(t[0]);
		p.add(t[1]);
		p.add(t[2]);
		p.add(t[3]);
		p.add(t[4]);
		p.add(l);
		p.add(b);
		f.add(p);
		f.setSize(650,250);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("modifica")) {
			
			op2.s.upPacient(Integer.parseInt(t[0].getText()),
					t[1].getText(),t[2].getText(),t[3].getText(),t[4].getText());
			l.setText("Pacient modificat!");
		}
	}
}
