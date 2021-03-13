package GUI;

import java.util.Vector;

import Domain.Consultatie;
import Domain.Medicament;

public class TabelConsultatii extends Tabel<Consultatie> {
	
	public TabelConsultatii(Vector<Consultatie> v) {
		rowData=new Object[100][6];
		columnNames=new String[6];
		for(int i=0;i<v.size();i++)
		{
			rowData[i][0]=v.get(i).getId();
			rowData[i][1]=v.get(i).getData();
			rowData[i][2]=v.get(i).getNume();
			rowData[i][3]=v.get(i).getPrenume();
			rowData[i][4]=v.get(i).getBoala();
			rowData[i][5]=v.get(i).getMedicament();
			}
		columnNames[0]="ID";
		columnNames[1]="DATA";
		columnNames[2]="NUME";
		columnNames[3]="PRENUME";
		columnNames[5]="MEDICAMENT";
		columnNames[4]="BOALA";
		
	}

}
