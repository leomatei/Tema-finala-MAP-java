package Test;
import Domain.*;
import Service.*;

public class Test_Met {
	public static void run() {
		Pacient p1= new Pacient(0,"","","","2015-02-20");
		Pacient p2=new Pacient(1,"","","","2017-12-23");
		assert Metode.Varsta(p1)==5;
		assert Metode.Varsta(p2)==2;
	}
}
