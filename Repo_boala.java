package Repository;
import Domain.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class Repo_boala extends Repo<Boala> {
	//derivata din clasa Repo
	public Repo_boala(String s) {
		try { BufferedReader fisIn = 
				  new BufferedReader(new FileReader(s));
			      String o;							//contor al tabloului de ziare
			      while((o = fisIn.readLine())!= null){
				    Boala e=new Boala(o);
				    super.v.add(e);
				    
			     }
			  fisIn.close();
			} 
			// try
		   catch(Exception e) {
		     System.out.println(e.getMessage());
		     e.printStackTrace();
		   } // catch //citiri valorile vectorului
			
	    }
	}
