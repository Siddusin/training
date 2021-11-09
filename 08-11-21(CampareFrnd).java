package techno.java.collectin;

import java.util.ArrayList;
import java.util.Collections;

import techno.java.collectin.Campare;

public class CampareFrnd {
public static void main(String[] args) {
	ArrayList<Friendship> list1=new ArrayList<Friendship>();
	list1.add(new Friendship("Avinash", 100, "BestFriend"));
	list1.add(new Friendship("Gaurav", 10, "BestFriend"));
	list1.add(new Friendship("Vijay", 1, "BestFriend"));
	list1.add(new Friendship("Manisha", 90, "BestFriend"));
	list1.add(new Friendship("Guldu", 8, "Friend"));
 
	CmapareFrndD cmapare=new CmapareFrndD();
	Collections.sort(list1,cmapare);
	System.out.println(list1);
}
}
