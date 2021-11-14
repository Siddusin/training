package techno.JavaAssignment.LinkedHashSetCom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetCom implements Comparable<LinkedHashSetCom > {
	int id;
	String name;
	


public LinkedHashSetCom(String name,int id ) {
		super();
		this.id = id;
		this.name = name;
	}

public static void main(String[] args) {
	LinkedHashSet<LinkedHashSetCom> list=new LinkedHashSet<LinkedHashSetCom>();
	LinkedHashSetComparator comparator=new LinkedHashSetComparator();
list.add(new LinkedHashSetCom("Sandy", 309));
list.add(new LinkedHashSetCom("Gourav", 221));
list.add(new LinkedHashSetCom("Vijay", 342));
list.add(new LinkedHashSetCom("Avinash", 343));

	ArrayList<LinkedHashSetCom>arrayList=new ArrayList<LinkedHashSetCom>(list);
	Collections.sort(arrayList);
	System.out.println(arrayList);
	Collections.sort(arrayList, comparator);
	System.out.println(arrayList);
	 
	}



@Override
public String toString() {
	return "LinkedHashSetCom [id=" + id + ", name=" + name + "]";
}

@Override
public int compareTo(LinkedHashSetCom o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}


}

