package View;
import java.util.Vector;



import Domain.*;

public class RaportPacient {
	private static void CapTabel1() {
		String sir="|BOLI           |";
		String linii="=================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
		
	}
	
	private static void CapTabel2() {
		String sir="|MEDICAMENTE    |";
		String linii="=================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
	}
	
	private static void TabBoli(Vector<Boala> v) {
		CapTabel1();
		
		for(Boala b:v) 
			System.out.format("|%-15s|\n",b.getNume());
		String linii="=================";
		System.out.println(linii);
	}
	
	private static void TabMed(Vector<Medicament> v) {
		CapTabel2();
		
		for(Medicament m:v) 
			System.out.format("|%-15s|\n",m.getNume());
		String linii="=================";
		System.out.println(linii);
		
	}
	
	public static void IstBoliMed2(Pacient p,Vector<Boala> vb,Vector<Medicament> vm) {
		//TODO
		System.out.println(p);
		
		String sir="|BOLI           |MEDICAMENTE    |";
		String linii="=================================";
		System.out.println(linii);
		System.out.println(sir);
		System.out.println(linii);
		for(int i=0;i<vb.size();i++)
			System.out.format("|%-15s|%-15s|\n",vb.get(i).getNume(),vm.get(i).getNume());
		System.out.println(linii);
			
	}
	
	public static void IstBoliMed(Pacient p,Vector<Boala> vb,Vector<Medicament> vm) {
		System.out.println(p);
		
		TabBoli(vb);
		TabMed(vm);
	}
	
}
