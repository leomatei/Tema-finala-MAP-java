package Test;
import Domain.*;

public class Test_domain {
	public static void run() {
		Boala b1=new Boala(1,"malarie");
		Boala b2=new Boala("1,malarie");
		assert(b1.getId()==b2.getId()&&
				b1.getNume()==b2.getNume());
	}
}
