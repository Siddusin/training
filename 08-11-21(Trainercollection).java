package techno.java.collectin.asignA.Trainer;

import java.util.ArrayList;
import java.util.Collections;

public class Trainercollection {
public static void main(String[] args) {
	ArrayList<Trainer> ar=new ArrayList<Trainer>();
	ar.add(new Trainer(101, "Sandesh", "2Yrs"));
	ar.add(new Trainer(101, "Avinash", "3Yrs"));
	ar.add(new Trainer(101, "Gaurav", "5Yrs"));
	ar.add(new Trainer(101, "Vijay", "1Yrs"));
	Collections.sort(ar);
	System.out.println(ar);
	TrainerDec dec=new TrainerDec();
	Collections.sort(ar,dec);
	System.out.println(ar);
}
}
