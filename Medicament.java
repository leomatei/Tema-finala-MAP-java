package Domain;

public class Medicament extends obj {
	//medicament are id, numesi boala, nu este neaparat ca boala sa existe
	private String nume;
	private String boala;
	
	public Medicament(int id, String nume, String boala) {
		super.setId(id);
		this.nume = nume;
		this.boala = boala;
	}
	
	public Medicament(String s) {
		String linie[]=s.split(",");
		super.setId(Integer.parseInt(linie[0]));
		this.nume=linie[1];
		this.boala=linie[2];
	}
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getBoala() {
		return boala;
	}

	public void setBoala(String boala) {
		this.boala = boala;
	}

	@Override
	public String toString() {
		return super.getId() + "," + nume + "," + boala;
	}
	
	
}
