package Service;
import Repository.*;

import java.net.URL;
import java.util.Vector;

import Domain.*;


public class Service {
	private Repo_boala rb;
	private Repo_medicament rm;
	private Repo_pacient rp;
	private Repo_consultatie rc;
	
	public Service(String sb, String sm, String sp, String sc) {
		
		String str=System.getProperty("user.dir")+"\\src\\";
		rb=new Repo_boala(str+sb);
		rm=new Repo_medicament(str+sm);
		rp=new Repo_pacient(str+sp);
		rc=new Repo_consultatie(str+sc);
	}
	
	public void addBoala(int id,String nume) {
		//adauga o boala
		//primeste id-ul si numele bolii
		Boala b=new Boala(id,nume);
		rb.adauga(b);
	}
	
	public void addMedicament(int id,String nume,String boala) {
		//aduaga un medicament
		//primeste idul, numele si boala pe care o trateaza medicamentul
		Medicament m=new Medicament(id,nume,boala);
		rm.adauga(m);
	}
	
	public void addPacient(int id,String nume,String prenume,String adresa,String data_nasterii) {
		//adauaga un pacient
		//primeste idul, numele, prenumele, adresa si data nasterii pacientului
		Pacient p=new Pacient(id,nume,prenume,adresa,data_nasterii);
		rp.adauga(p);
	}
	
	public void addConsultatie(int id,String data,String nume,String prenume,String boala,String medicament) {
		//adauaga o consultatie
		//primeste idul, numele si prenumele pacientuli, data consultatiei, boala observata 
		//si medicamentul pentru aceasta
		Consultatie c=new Consultatie(id,data,nume,prenume,boala,medicament);
		rc.adauga(c);
	}
	
	private int FindB(String nume) {
		//gaseste o boala dupa nume
		//primeste numele bolii
		//returnea pozitia in vectorul din repo
		
		for(int i=0;i<rb.GetV().size();i++)
			if(rb.GetV().get(i).getNume().compareTo(nume)==0) {
				
				return i;
			}
		return -1;
	}
	
	private int FindM(String nume) {
		//gaseste unmedicament dupa nume
		//primeste numele medicamentului
		//returnea pozitia in vectorul din repo
		for(int i=0;i<rm.GetV().size();i++)
			if(rm.GetV().get(i).getNume().compareTo(nume)==0) return i;
		return -1;
	}
	
	private int FindP(String nume,String prenume) {
		//gaseste un pacient dupa nume si prenume
		//primeste numele si prenumele pacientului 
		//returnea pozitia in vectorul din repo
		for(int i=0;i<rp.GetV().size();i++)
			if(rp.GetV().get(i).getNume().compareTo(nume)==0&&
			rp.GetV().get(i).getPrenume().compareTo(prenume)==0) return i;
		return -1;
	}
	
	private int FindBoalaById(int id) {
		//cauta o boala dupa id
		//primeste id ul bolii
		//returnea pozitia in vectorul din repo
		for(int i=0;i<rb.GetV().size();i++)
			if(rb.GetV().get(i).getId()==id) return i;
		return -1;
	}
	
	private int FindMedicamentById(int id) {
		//cauta un medicament dupa id
		//primeste id ul medicamentului
		//returnea pozitia in vectorul din repo
		for(int i=0;i<rm.GetV().size();i++)
			if(rm.GetV().get(i).getId()==id) return i;
		return -1;
	}
	
	private int FindPacientById(int id) {
		//cauta un pacient dupa id
		//primeste id ul pacientului
		////returnea pozitia in vectorul din repo
		for(int i=0;i<rp.GetV().size();i++)
			if(rp.GetV().get(i).getId()==id) return i;
		return -1;
	}
	
	private int FindConsultatieById(int id) {
		//cauta o consultatie dupa id
		//primeste id ul consultatiei
		//returnea pozitia in vectorul din repo
		for(int i=0;i<rc.GetV().size();i++)
			if(rc.GetV().get(i).getId()==id) return i;
		return -1;
	}
	
	public void delBoala(String nume) {
		//sterge o boala dupa nume 
		//primeste numele bolii
		if(FindB(nume)>=0) rb.sterge(FindB(nume));
		
	}
	
	public void delMedicament(String nume) {
		//sterge un medicament dupa nume
		//primeste nume medicamentului
		if(FindM(nume)>=0) rm.sterge(FindM(nume));
	}
	
	public void delPacient(String nume, String prenume) {
		//sterge un pacient dupa nume si prenume
		//primeste numele si prenumele pacientului
		if(FindP(nume,prenume)>=0) rp.sterge(FindP(nume,prenume));
	}
	
	public int FindC(int i) {
		for(int j=0;j<rc.GetV().size();j++)
			if(i==rc.GetV().get(j).getId()) return j;
		return -1;
	}
	
	public void delConsultatie(int i) {
		//sterge o consultatie dupa id
		//primeste idul consultatiei
		if(FindC(i)>-1) rc.sterge(FindC(i));
	}
	
	public void upBoala(int id,String nume) {
		//modifica o boala
		//primeste id ul bolii di modificat si noul nume
		Boala b=new Boala(id,nume);
		if(FindBoalaById(id)>=0)	
			rb.modifica(FindBoalaById(id), b);
	}
	
	public void upMedicament(int id,String nume,String boala) {
		//modifica un medicament
		//primeste id ul medicamentului de modificat,noul nume si noua boala pe care o amelioreaza
		Medicament m=new Medicament(id,nume,boala);
		if(FindMedicamentById(id)>=0) 
			rm.modifica(FindMedicamentById(id),m);
	}
	
	public void upPacient(int id,String nume,String prenume,String adresa,String data_nasterii) {
		//modifca un pacient
		//primeste id ul pacientului de modificat
		//primeste noul nume, noul prenume, noua adresa, noua data de nastere
		Pacient p=new Pacient(id,nume,prenume,adresa,data_nasterii);
		if(FindPacientById(id)>=0)
			rp.modifica(FindPacientById(id),p);
	}
	
	public void upConsultatie(int id,String data,String nume,String prenume,String boala,String medicament) {
		//modifca o consultatie
		//primeste id ul consultatie de modificat
		//noul nume si prenume al pacientului ,noua boala,noul medicament
		Consultatie c=new Consultatie(id,data,nume,prenume,boala,medicament);
		if(FindConsultatieById(id)>=0)
			rc.modifica(FindConsultatieById(id),c);
	}
	
	public Vector<Boala> GetB(){
		//returneaza lista de boli
		return rb.GetV();
	}
	
	public Vector<Medicament> GetM(){
		//returneaza lista de medicamente
		return rm.GetV();
	}
	
	public Vector<Pacient> GetP(){
		//returneaza lista de pacienti
		return rp.GetV();
	}
	
	public Vector<Consultatie> GetC(){
		//returneaza lista de consultatii
		return rc.GetV();
	}
	
	public Vector<Pacient> SortP(){
		//returneaza o lista noua de pacienti
		//contine pacientii din lista initiala dar sunt sortati alfabetc dupa nume
		return Metode.sortNume(rp.GetV());
	}
	
	
	public Pacient getp(String nume,String prenume) {
		//cauta un pacient dupa nume si prenume
		//primeste numele si prenumele pacientului
		//returneaza obiectul pacient 
		Pacient pa=new Pacient(0,"","","","");
		for(Pacient p:rp.GetV())
			if(nume.compareTo(p.getNume())==0&&prenume.compareTo(p.getPrenume())==0) { 
				return p;		
			}
		return pa;
	}
	public Vector<Boala> rap1(String nume,String prenume){
		//retunreaza lista de boli pe care le- a avut un pacient
		//primeste numele pacientului
		//returneza lista cu boli ale pacientului
		Vector<Boala> vb=new Vector<Boala>();
		for(Consultatie c:rc.GetV())
			if(nume.compareTo(c.getNume())==0&&prenume.compareTo(c.getPrenume())==0) {
				Boala b=new Boala(0,c.getBoala());
				vb.add(b);
				}
		return vb;
	}
	
	public Vector<Medicament> rap2(String nume,String prenume){
		//da o lista de medicamente care au fost prescrise pacientului
		//primeste numele si prenumle pacientului
		//returneaza lista de medicamentele pentru pacient
		Vector<Medicament> vm=new Vector<Medicament>();
		for(Consultatie c:rc.GetV())
			if(nume.compareTo(c.getNume())==0&&prenume.compareTo(c.getPrenume())==0) {
				Medicament m=new Medicament(0,c.getMedicament(),c.getBoala());
				vm.add(m);
				}
		return vm;
	}
	
	public Vector<Pacient> rapp1(){
		//retuneaza pacientii care au fost consultati in ultima luna
		Vector<Pacient> v=new Vector<Pacient>();
		for(Consultatie c:rc.GetV())
			if(Metode.ultLuna(c)==true) {
				Pacient p=new Pacient(getp(c.getNume(),c.getPrenume()).toString());
				v.add(p);
			}
		return v;
	}
	
	private void delPacient(String nume,String prenume,Vector<Pacient> v) {
		//sterge un pacient dupa numele si prenume dintr o lista de pacienti
		for(int i=0;i<v.size();i++)
			if(v.get(i).getNume().compareTo(nume)==0&&v.get(i).getPrenume().compareTo(prenume)==0) 
				v.remove(i);
		
	}
	
	public Vector<Pacient> rapp2(){
		//pacientii care trebuie consultati in luna curenta
		//returneaz o lista cu pacientii care nu au fost consultati in luna curenta
		Vector<Pacient> v=new Vector<Pacient>(rp.GetV());
		for(Consultatie c:rc.GetV())
			if(Metode.lunaCur(c)==true) {
				delPacient(c.getNume(),c.getPrenume(),v);
				
			}
		return v;
	}
	
	
	private Vector<Pacient> VarstaCuprinsa(int v1, int v2){
		//returneaza o lista cu pacienti care au varsta cuprinsa intre doua numere
		//primeste v1 care este marginea inferioara a intervalului
		//primeste v2 care este marginea superioara a intervalului
		Vector<Pacient> v=new Vector<Pacient>();
		for(Pacient p:rp.GetV())
			if(Metode.Varsta(p)>=v1&&Metode.Varsta(p)<=v2)
				v.add(p);
		return v;
	}
	
	public Vector<Vector<Pacient>> Varste(){
		// o tabelă cu toţi pacienţii 
		//clasificaţi pe categorii de 
		//vârstă (0-1, 2-4, 5-10, 11-18, 19-59 şi peste 60)
		Vector<Vector<Pacient>> v=new Vector<Vector<Pacient>>();
		v.add(VarstaCuprinsa(0,1));
		v.add(VarstaCuprinsa(2,4));
		v.add(VarstaCuprinsa(5,10));
		v.add(VarstaCuprinsa(11,18));
		v.add(VarstaCuprinsa(19,59));
		v.add(VarstaCuprinsa(60,100));
		return v;
	}
}
