package Repository;

import java.util.Vector;

public class Repo_memorie<T> extends Repo<T> {
	//in caz ca trebuie sa folosim repisitory in memorie nu din fisier
	public Repo_memorie() {
		super.v=new Vector<T>();
	}
}
