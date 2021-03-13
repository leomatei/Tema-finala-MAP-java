package View;

import java.util.Vector;

import Domain.*;

public class View_Pacient {
	private static void CapTabel() {
		String sir="|ID  |NUME           |PRENUME        |ADRESA         |DATA NASTERII       |";
		String linii="===========================================================================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
	}
	
	public static void Tabel(Vector<Pacient> v) {
		CapTabel();
		
		for(Pacient p:v)
			System.out.format("|%4d|%-15s|%-15s|%-15s|%-20s|\n",p.getId(),p.getNume(),p.getPrenume(),
					p.getAdresa(),p.getData_nasterii());
		String linii="===========================================================================";
		System.out.println(linii);
	}
}
