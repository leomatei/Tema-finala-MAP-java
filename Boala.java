package Domain;

public class Boala extends obj{
	//boala contine id si numele bolii
	private String nume;
	
	public Boala(int id,String nume) {
		super.setId(id);
		this.nume=nume;
	}
	
	public Boala(String s) {
		//constructorul pentru citirea din fisier
		String linie[]=s.split(",");
		super.setId(Integer.parseInt(linie[0]));
		this.nume=linie[1];
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return super.getId()+","+nume ;
	}
	
}
