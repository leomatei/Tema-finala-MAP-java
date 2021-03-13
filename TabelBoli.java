package GUI;

import java.util.Vector;

import javax.swing.JTable;

import Domain.Boala;

public class TabelBoli extends Tabel<Boala>{

	public TabelBoli(Vector<Boala> v) {
		rowData=new Object[100][2];
		columnNames=new String[2];
		for(int i=0;i<v.size();i++)
		{
			rowData[i][0]=v.get(i).getId();
			rowData[i][1]=v.get(i).getNume();
		}
		columnNames[0]="ID";
		columnNames[1]="NUME BOALA";
		
	}
}
