package Test;
import Domain.*;
import Repository.*;

public class Test_repo {
		public static void run() {
			Repo_boala r=new Repo_boala
					("c:\\Users\\Leo\\Desktop\\!!!\\map\\lab\\MedicFam\\src\\BoliTest.txt");
			assert !r.isEmpty();
			assert r.size()==3;
			r.sterge(1);
			assert r.GetAt(1).getId()==3;
			Boala b=new Boala(1,"b2");
			r.adauga(b);
			assert r.GetAt(2)==b;
		}
}
