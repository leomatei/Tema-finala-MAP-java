package CRUDGUI;

import java.awt.event.ActionEvent;

import Service.Service;

public class addBoala extends op {

	public addBoala(String nume_fereastra, String nume_buton, Service s) {
		super(nume_fereastra, nume_buton, s);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("adauga")) {
			String o[]=t.getText().split(",");
			op.s.addBoala(Integer.parseInt(o[0]),o[1]);
			l.setText("Boala adaugata!");
		}
	}
	
}
