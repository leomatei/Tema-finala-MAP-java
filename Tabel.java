package GUI;

import java.util.Vector;

import javax.swing.JTable;

public abstract class Tabel<T> extends JTable {
	public static Object[][] rowData;
	public static String[] columnNames;
	public int getRowCount() { return rowData.length; }
	public int getColumnCount() { return columnNames.length; }
	
}
