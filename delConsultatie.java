package CRUDGUI;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import Service.*;

public class delConsultatie extends op {
	
	public delConsultatie(String s1,String s2,Service s) {
		super(s1,s2,s);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		if(s.equals("sterge")) {
		
			op.s.delConsultatie(Integer.parseInt(t.getText()));
			l.setText("Consultatie stearsa!");
		}
	}
}
