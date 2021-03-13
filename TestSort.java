package Test;
import java.util.Vector;

import Domain.*;
import Service.*;

public class TestSort {
	public static void run() {
		Pacient p1=new Pacient(1,"p1","p1","b1","m1");
		Pacient p2=new Pacient(2,"p2","p1","b1","m1");
		Pacient p3=new Pacient(3,"p3","p1","b1","m1");
		Pacient p4=new Pacient(4,"p4","p1","b1","m1");
		
		Vector<Pacient> v=new Vector<Pacient>();
		
		v.add(p4);
		v.add(p2);
		v.add(p1);
		v.add(p3);
		
		Vector<Pacient> vs=Metode.sortNume(v);
		
		assert vs.get(0)==p1;
		assert vs.get(1)==p2;
		assert vs.get(2)==p3;
		assert vs.get(3)==p4;
		
		//System.out.println(vs);
	}
}
