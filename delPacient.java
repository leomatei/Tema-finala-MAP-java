package CRUDGUI;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Service.Service;

public class delPacient extends op2 {

	public delPacient(String nume_fereastra, String nume_buton, Service s) {
		super(nume_fereastra, nume_buton, s);
		l=new JLabel("introduceti id, nume, prenumen, in aceasta ordine");
		t=new JTextField[2];
		t[0]=new JTextField(50);
		t[1]=new JTextField(50);
		JPanel p=new JPanel();
		p.add(t[0]);
		p.add(t[1]);
		f.add(p);
		p.add(l);
		p.add(b);
		f.setSize(650,250);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("sterge")) {
			
			op2.s.delPacient(t[0].getText(),t[1].getText());
			l.setText("Pacient sters!");
		}
	}
	
}
