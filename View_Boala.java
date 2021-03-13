package View;

import java.util.Vector;

import Domain.*;

public class View_Boala {
	private static void CapTabel() {
		String sir="|ID  |NUME BOALA     |";
		String linii="======================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
	}
	
	public static void Tabel(Vector<Boala> v) {
		CapTabel();
		
		for(Boala b:v)
			System.out.format("|%4d|%-15s|\n",b.getId(),b.getNume());
		String linii="======================";
		System.out.println(linii);
	}
}
