package Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import Domain.*;

public class Repo_consultatie extends Repo<Consultatie> {
	//derivata din clasa Repo
	public Repo_consultatie(String s) {
		try { BufferedReader fisIn = 
				  new BufferedReader(new FileReader(s));
			      String o;							//contor al tabloului de ziare
			      while((o = fisIn.readLine())!= null){
				    Consultatie e=new Consultatie(o);
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
