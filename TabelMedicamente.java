package GUI;

import java.util.Vector;

import Domain.Boala;
import Domain.Medicament;

public class TabelMedicamente extends Tabel {

	
	public TabelMedicamente(Vector<Medicament> v) {
		rowData=new Object[100][3];
		columnNames=new String[3];
		for(int i=0;i<v.size();i++)
		{
			rowData[i][0]=v.get(i).getId();
			rowData[i][1]=v.get(i).getNume();
			rowData[i][2]=v.get(i).getBoala();
			}
		columnNames[0]="ID";
		columnNames[1]="NUME MEDICAMENT";
		columnNames[2]="NUME BOALA";
		
	}
}
