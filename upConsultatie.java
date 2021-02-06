package CRUDGUI;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Service.Service;

public class upConsultatie extends op2{

	public upConsultatie(String s1, String s2, Service s)
	{
		super(s1,s2,s);
		 l=new JLabel("introduceti id, data, nume, prenume,\n"
				+ "boala si medicamentul, in aceasta ordine\n"+
				"data trebuie sa fie yyyy-mm-dd");
		t=new JTextField[6];
		t[0]=new JTextField(50);
		t[1]=new JTextField(50);
		t[2]=new JTextField(50);
		t[3]=new JTextField(50);
		t[4]=new JTextField(50);
		t[5]=new JTextField(50);
		
		JPanel p=new JPanel();
		p.add(t[0]);
		p.add(t[1]);
		p.add(t[2]);
		p.add(t[3]);
		p.add(t[4]);
		p.add(t[5]);
		p.add(l);
		p.add(b);
		f.add(p);
		f.setSize(650,260);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("modifica")) {
			
			op2.s.upConsultatie(Integer.parseInt(t[0].getText()),
					t[2].getText(),t[1].getText(),t[3].getText(),
					t[4].getText(),t[5].getText());
			l.setText("Consultatie modificata!");
		}
	}

}
