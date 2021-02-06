package Console;
import GUI.Meniu;
import Test.*;
import Service.*;
public class App {

	public static void main(String[] args) {
		//Test_All.run();
		//pornirea UI
		//UI.run();
		//portnirea GUI
		//System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Service s=new Service("Boli.txt","Medicamente.txt",
				"Pacienti.txt","Consultatii.txt");
		Meniu.Meniu_principal(s);

	}

}
