package techno.java.collectin.asignA.HashtoTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashtoTree {

	public static void main(String[] args) {
    HashSet<Hash1> set=new HashSet<Hash1>();
    set.add(new Hash1(54));
    set.add(new Hash1(43));
    set.add(new Hash1(65));
    set.add(new Hash1(98));
    set.add(new Hash1(46));
    TreeSet<Hash1> set1=new TreeSet<Hash1>(set);
	 System.out.println(set1); 
    ArrayList<Hash1> are=new ArrayList<Hash1>(set1);
    
    HashDec dec=new HashDec();
    Collections.sort(are,dec);
    System.out.println(are);
	}

}
