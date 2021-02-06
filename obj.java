package Domain;

public abstract class obj {
	//clasa obj este calsa din care deriva toate celelalte clase din domain aceasta
	//contine doar id cu functii de get si set
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public abstract String toString() ;
	
	

	
	
}
