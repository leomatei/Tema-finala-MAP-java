package Console;

import java.util.Scanner;

public class Citire {
	public static int citIntreg(String sir){
		//citeste un numar intreg de la tastatura
		//retunr numarul intreg citit
		//throw Exception daca numarul nu este intreg
		try{
			System.out.print(sir);
			Scanner S= new Scanner(System.in);
			int I=S.nextInt();
			return I;			
		}
		catch(Exception E){
			System.out.println("Ai gresit, mai incearca");
			return citIntreg(sir);
		}	
	}
	
	public static long citLong(String sir){
		//citeste un numar long de la tastatura
				//retunr numarul long citit
				//throw Exception daca numarul nu este long
		try{
			System.out.print(sir);
			Scanner S= new Scanner(System.in);
			long l=S.nextLong();
			return l;			
		}
		catch(Exception E){
			System.out.println("Ai gresit, mai incearca");
			return citLong(sir);
		}	
	}
	
	public static String citString(String sir){
		//citeste un string de la tastatura
				//retunr numarul stringul citit
				//throw Exception daca inputul nu este string
		try{
			System.out.print(sir);
			Scanner S= new Scanner(System.in);
			String s=S.nextLine();
			return s;			
		}
		catch(Exception E){
			System.out.println("Ai gresit, mai incearca");
			return citString(sir);
		}	
	}
}
