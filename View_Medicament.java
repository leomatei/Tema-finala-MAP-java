package View;

import java.util.Vector;

import Domain.*;

public class View_Medicament {
	private static void CapTabel() {
		String sir="|ID  |NUME MEDICAMENT  |NUME BOALA     |";
		String linii="========================================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
	}
	
	public static void Tabel(Vector<Medicament> v) {
		CapTabel();
		
		for(Medicament m:v)
			System.out.format("|%4d|%-17s|%-15s|\n",m.getId(),m.getNume(),m.getBoala());
		String linii="========================================";
		System.out.println(linii);
	}
}
