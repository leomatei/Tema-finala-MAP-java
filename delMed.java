package CRUDGUI;

import java.awt.event.ActionEvent;

import Service.Service;

public class delMed  extends op {

	public delMed(String nume_fereastra, String nume_buton, Service s) {
		super(nume_fereastra, nume_buton, s);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("sterge")) {
		
			op.s.delMedicament(t.getText());
			l.setText("Medicament sters!");
		}
	}
}