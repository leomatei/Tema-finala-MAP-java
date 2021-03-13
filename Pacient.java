package Domain;

public class Pacient extends obj{
	//pacient contine id,nume,prenume,adresa de locuinta si data  nasterii memorata ca string
	private String nume;
	private String prenume;
	private String adresa;
	private String data_nasterii;//trebuie scrisa ca si yyyy-mm-dd
	
	public Pacient(int id,String nume,String prenume, String adresa,String data_nasterii) {
		super.setId(id);
		this.nume=nume;
		this.prenume=prenume;
		this.adresa=adresa;
		this.data_nasterii=data_nasterii;
	}
	
	public Pacient(String s) {
		String linie[]=s.split(",");
		super.setId(Integer.parseInt(linie[0]));
		this.nume=linie[1];
		this.prenume=linie[2];
		this.adresa=linie[3];
		this.data_nasterii=linie[4];
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
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	
	
	public String getData_nasterii() {
		return data_nasterii;
	}

	public void setData_nasterii(String data_nasterii) {
		this.data_nasterii = data_nasterii;
	}

	@Override
	public String toString() {
		return super.getId() + "," + nume + "," + prenume + "," + adresa+","+data_nasterii;
	}
	
	
}
