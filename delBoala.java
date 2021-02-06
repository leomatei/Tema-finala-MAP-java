package CRUDGUI;

import java.awt.event.ActionEvent;

import Service.Service;

public class delBoala extends op {

	public delBoala(String nume_fereastra, String nume_buton, Service s) {
		super(nume_fereastra, nume_buton, s);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("sterge")) {
			
			op.s.delBoala(t.getText());
			l.setText("Boala stearsa!");
		}
	}
	
}
