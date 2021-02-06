package Domain;

public class Consultatie extends obj {
	//consultatia contine id nume,prenume,data, boala si medicamentul, nu trebuie ca 
	//medicamentul sa se potriveasca pentru boala sau ca consultatia sa fie,
	//dupa data de nastere a pacientului
	private String nume;
	private String prenume;
	private String data;//trebuie scrisa ca si yyyy-mm-dd
	private String boala;
	private String medicament;
	
	public Consultatie(int id, String nume,String data,
			String prenume, String boala,String medicament) {
		super.setId(id);
		this.nume=nume;
		this.prenume=prenume;
		this.data=data;
		this.boala=boala;
		this.medicament=medicament;
	}
	
	public Consultatie(String s) {
		//constructorul pentru citirea din fisier
		String linie[]=s.split(",");
		super.setId(Integer.parseInt(linie[0]));
		this.data=linie[1];
		this.nume=linie[2];
		this.prenume=linie[3];
		this.boala=linie[4];
		this.medicament=linie[5];
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getBoala() {
		return boala;
	}

	public void setBoala(String boala) {
		this.boala = boala;
	}

	public String getMedicament() {
		return medicament;
	}

	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return super.getId()+"," +data+","+ nume + "," 
	+ prenume + "," + boala+ "," + medicament;
	}

	
	
}
