package techno.java.collectin.asignA.Family;

import java.util.ArrayList;
import java.util.Collections;


public class FamilyCollection {
	public static void main(String[] args) {
		ArrayList<Family> ar=new ArrayList<Family>();
		ar.add(new Family( "Father", "Nagaraj",45));
		ar.add(new Family("Mother", "Mangala",40));
		ar.add(new Family("Brother", "Santosh",27));
		ar.add(new Family("Sister", "Kavya",21));
		Collections.sort(ar);
		System.out.println(ar);
		FamilyDec dec=new FamilyDec();
		Collections.sort(ar,dec);
		System.out.println(ar);
	}

}
