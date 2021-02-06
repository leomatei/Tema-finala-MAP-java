package Console;
import java.util.Vector;
import Domain.*;

import Service.*;
import View.*;

public class UI {
	private static Service s=new Service("Boli.txt","Medicamente.txt",
			"Pacienti.txt","Consultatii.txt");
	
	private static int show_menu() {
		System.out.println("1.Boli");
		System.out.println("2.Medicamente");
		System.out.println("3.Pacienti");
		System.out.println("4.Consultatii");
		System.out.println("5.Afisare boli");
		System.out.println("6.Afisare medicamente");
		System.out.println("7.Afisare pacienti");
		System.out.println("8.Afisare consultatii");
		System.out.println("9.Rapoarte");
		System.out.println("0.Iesire");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	private static int show_menu_boli() {
		System.out.println("1.Adaugare boala");
		System.out.println("2.Modifica boala");
		System.out.println("3.Sterge boala");
		System.out.println("4.Afisare");
		System.out.println("0.Inapoi");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	private static int show_menu_medicament() {
		System.out.println("1.Adaugare medicamente");
		System.out.println("2.Modifica medicamente");
		System.out.println("3.Sterge medicamente");
		System.out.println("4.Afisare");
		System.out.println("0.Inapoi");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	private static int show_menu_pacient() {
		System.out.println("1.Adaugare pacient");
		System.out.println("2.Modifica pacient");
		System.out.println("3.Sterge pacient");
		System.out.println("4.Afisare");
		System.out.println("0.Inapoi");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	private static int show_menu_consultatie() {
		System.out.println("1.Adaugare consultatie");
		System.out.println("2.Modifica consultatie");
		System.out.println("3.Sterge consultatie");
		System.out.println("4.Afisare");
		System.out.println("0.Inapoi");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	
	private static void handle_add_boala() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		s.addBoala(id,nume);
	}
	
	private static void handle_up_boala() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		s.upBoala(id,nume);
	}
	
	private static void handle_del_boala() {
		String nume=new String();
		nume=Citire.citString("Dati numele: ");
		s.delBoala(nume);
	}
	
	private static void handle_add_medicament() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		String numeb=Citire.citString("Dati numele bolii: ");
		s.addMedicament(id,nume,numeb);
	}
	
	private static void handle_up_medicament() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		String numeb=Citire.citString("Dati numele bolii: ");
		s.upMedicament(id,nume,numeb);
	}
	
	private static void handle_del_medicament() {
		String nume=Citire.citString("Dati numele: ");
		s.delMedicament(nume);
	}
	
	private static void handle_add_pacient() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		String adresa=Citire.citString("Dati adresa: ");
		String data_nasterii=Citire.citString("Dati data nasterii: ");
		s.addPacient(id,nume,prenume,adresa,data_nasterii);
	}
	
	private static void handle_up_pacient() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		String adresa=Citire.citString("Dati adresa: ");
		String data_nasterii=Citire.citString("Dati data nasterii: ");
		s.upPacient(id,nume,prenume,adresa,data_nasterii);
	}
	
	private static void handle_del_pacient() {
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		s.delPacient(nume,prenume);
	}
	
	private static void handle_add_consultatie() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String data=Citire.citString("Dati data(yyyy-mm-dd): ");
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		String boala=Citire.citString("Dati boala: ");
		String medicament=Citire.citString("Dati medicament: ");
		s.addConsultatie(id,data,nume,prenume,boala,medicament);
	}
	
	private static void handle_up_consultatie() {
		int id=Citire.citIntreg("Dati id-ul: ");
		String data=Citire.citString("Dati data(yyyy-mm-dd): ");
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		String boala=Citire.citString("Dati boala: ");
		String medicament=Citire.citString("Dati medicament: ");
		s.upConsultatie(id,data,nume,prenume,boala,medicament);
	}
	
	private static void handle_del_consultatie() {
		int id=Citire.citIntreg("Dati id-ul: ");
		s.delConsultatie(id);
	}
	
	private static void Boli() {
		View_Boala.Tabel(s.GetB());
		int op=show_menu_boli();
		while(op!=0) {
			if(op==1) handle_add_boala();
			else if(op==2) handle_up_boala();
			else if(op==3) handle_del_boala();
			else if(op==4) View_Boala.Tabel(s.GetB());
			else System.out.println("Invalid!");
			op=show_menu_boli();
		}
	}
	
	private static void Medicamente() {
		View_Medicament.Tabel(s.GetM());
		int op=show_menu_medicament();
		while(op!=0) {
			if(op==1) handle_add_medicament();
			else if(op==2) handle_up_medicament();
			else if(op==3) handle_del_medicament();
			else if(op==4) View_Medicament.Tabel(s.GetM());
			else System.out.println("Invalid!");
			op=show_menu_medicament();
		}
	}
	
	private static void Pacienti() {
		View_Pacient.Tabel(s.GetP());
		int op=show_menu_pacient();
		while(op!=0) {
			if(op==1) handle_add_pacient();
			else if(op==2) handle_up_pacient();
			else if(op==3) handle_del_pacient();
			else if(op==4) View_Pacient.Tabel(s.GetP());
			else System.out.println("Invalid!");
			op=show_menu_pacient();
		}
	}
	
	private static void Consultatii() {
		View_Consultatie.Tabel(s.GetC());
		int op=show_menu_consultatie();
		while(op!=0) {
			if(op==1) handle_add_consultatie();
			else if(op==2) handle_up_consultatie();
			else if(op==3) handle_del_consultatie();
			else if(op==4) View_Consultatie.Tabel(s.GetC());
			else System.out.println("Invalid!");
			op=show_menu_consultatie();
		}
	}
	
	private static void handle_raport_pacient() {
		String nume=Citire.citString("Dati numele: ");
		String prenume=Citire.citString("Dati prenumele: ");
		RaportPacient.IstBoliMed2(s.getp(nume, prenume),s.rap1(nume,prenume),s.rap2(nume, prenume));
	}
	
	private static void handle_varste_pacienti() {
		Vector<Vector<Pacient>> v=new Vector<Vector<Pacient>>(s.Varste());
		System.out.println("0-1 ANI");
		View_Pacient.Tabel(v.get(0));
		System.out.println("2-4 ANI");
		View_Pacient.Tabel(v.get(1));
		System.out.println("5-10 ANI");
		View_Pacient.Tabel(v.get(2));
		System.out.println("11-18 ANI");
		View_Pacient.Tabel(v.get(3));
		System.out.println("19-59 ANI");
		View_Pacient.Tabel(v.get(4));
		System.out.println("PESTE 60 DE ANI");
		View_Pacient.Tabel(v.get(5));
	}
	
	private static int show_menu_raport() {
		System.out.println("1.Sortare pacienti dupa nume");
		System.out.println("2.Pacientii consultati in ultima luna");
		System.out.println("3.Istoric boli si medicamente pt un pacient");
		System.out.println("4.Pacientii care nu au fost consultati luna curenta");
		System.out.println("5.Clasificare pacienti dupa varsta");
		System.out.println("0.Iesire");
		return Citire.citIntreg("Optiunea ta: ");
	}
	
	private static void Rapoarte() {
		int op=show_menu_raport();
		while(op!=0) {
			if(op==1) View_Pacient.Tabel((Metode.sortNume(s.GetP())));
			else if(op==2) View_Pacient.Tabel(s.rapp1());
			else if(op==3) handle_raport_pacient();
			else if(op==4) View_Pacient.Tabel(s.rapp2());
			else if(op==5) handle_varste_pacienti();
			else System.out.println("Invalid");
			op=show_menu_raport();
		}
	}

	public static void run() {
		int op=show_menu();
		while(op!=0) {
			if(op==1) Boli();
			else if(op==2) Medicamente();
			else if(op==3) Pacienti();
			else if(op==4) Consultatii();
			else if(op==5) View_Boala.Tabel(s.GetB());
			else if(op==6) View_Medicament.Tabel(s.GetM());
			else if(op==7) View_Pacient.Tabel(s.GetP());
			else if(op==8) View_Consultatie.Tabel(s.GetC());
			else if(op==9) Rapoarte();
			else System.out.println("Invalid");
			op=show_menu();
		}
	}
}
