package Service;
import java.util.Vector;

import Domain.*;
import java.time.LocalDate;
public class Metode {
	//metodele din aceasta clasa se vor folosi in service pentru 
	//o scriere mai naturala 
	public static Vector<Pacient> sortNume(Vector<Pacient> v){
		//sortarea dupa nume a pacientilor
		//primeste un vector de pacienti
		//returneaza vectorul de pacienti sortat
		Vector<Pacient> vs=new Vector<Pacient>(v);
		int ok=0;
		while(ok==0) {
			ok=1;
			for(int i=0;i<vs.size()-1;i++) {
				if(vs.get(i).getNume().compareTo(vs.get(i+1).getNume())>=1) {
					
					Pacient aux=vs.get(i);
					vs.set(i,vs.get(i+1));
					vs.set(i+1,aux);
					ok=0;
				}
			}
		}
		return vs;
	}
	
	public static boolean ultLuna(Consultatie c){
		//verifica daca o consultatie a avut loc in luna trecuta
		//primeste o consultatie
		//returneaza true sau false
		LocalDate data=LocalDate.parse(c.getData());
		LocalDate now= LocalDate.now();
		if(now.getMonthValue()==1 && data.getMonthValue()==12) return true;
		if(now.getMonthValue()-data.getMonthValue()==1) return true;
		return false;
	}
	
	public static boolean lunaCur(Consultatie c) {
		//verifica daca p consultatie a avut loc in luna curenta
		//primeste o consultatie
		//returneaza true sau fasle
		LocalDate data=LocalDate.parse(c.getData());
		LocalDate now= LocalDate.now();
		if(now.getMonthValue()==data.getMonthValue()) return true;
		return false;
	}
	
	public static int Varsta(Pacient p) {
		//calculeaza varsta unui pacient
		//primeste un obiect de tip pacient
		//returneaza varsta acestuia exprimata in ani
		LocalDate data=LocalDate.parse(p.getData_nasterii());
		LocalDate now= LocalDate.now();
		int d=now.getDayOfMonth()-data.getDayOfMonth(),
				m=now.getMonthValue()-data.getMonthValue(),
				y=now.getYear()-data.getYear();
		if(y>0)
		{
			if(m<0) return y-1;
			else if(d<0) return y-1;
		}
		return y;
	}
	
}
