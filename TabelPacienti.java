package GUI;

import java.util.Vector;

import Domain.Medicament;
import Domain.Pacient;

public class TabelPacienti extends Tabel {
	
	public TabelPacienti(Vector<Pacient> v) {
		rowData=new Object[100][5];
		columnNames=new String[5];
		for(int i=0;i<v.size();i++)
		{
			rowData[i][0]=v.get(i).getId();
			rowData[i][1]=v.get(i).getNume();
			rowData[i][2]=v.get(i).getPrenume();
			rowData[i][3]=v.get(i).getAdresa();
			rowData[i][4]=v.get(i).getData_nasterii();
			}
		columnNames[0]="ID";
		columnNames[1]="NUME";
		columnNames[2]="PRENUME";
		columnNames[3]="ADRESA";
		columnNames[4]="DATA NASTERII";
		
	}

}
