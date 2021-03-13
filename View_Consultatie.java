package View;

import java.util.Vector;

import Domain.*;

public class View_Consultatie {
	private static void CapTabel() {
		String sir="|ID  |DATA       |NUME           |PRENUME        |NUME BOALA     |NUME MEDICAMENT|";
		String linii="==================================================================================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
	}
	
	public static void Tabel(Vector<Consultatie> v) {
		CapTabel();
		
		for(Consultatie c:v)
			System.out.format("|%4d|%11s|%-15s|%-15s|%-15s|%-15s|\n",c.getId(),c.getData(),c.getNume(),
					c.getPrenume(),c.getBoala(),c.getMedicament());
		String linii="==================================================================================";
		System.out.println(linii);
	}
	
}
