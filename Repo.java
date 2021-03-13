package Repository;
import java.util.Vector;

public class Repo<T> {
	//clasa genrica repo primeste un atribut T aceasta clasa contine functii CRUD
	//scopul acestei clase este pentru aficientiza scrisul programului
	protected Vector<T> v=new Vector<T>();
	
	public void adauga(T e) {
		v.add(e);
	}
	
	public int sterge(int i) {
		if(i-1>v.size()) return 0;
		v.remove(i);
		return 1;
	}
	
	public void modifica(int i,T e) {
		v.setElementAt(e, i);
	}
	
	public int size() {
		return v.size();
	}
	
	public boolean isEmpty() {
		return v.isEmpty();
	}
	
	public T GetAt(int i){
		return v.get(i);
	}
	
	public Vector<T> GetV(){
		return v;
	}
}
