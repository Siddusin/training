package techno.java.collectin.asignA.HashtoTree;

import java.util.Comparator;

public class HashDec implements Comparator<Hash1>{

	@Override
	public int compare(Hash1 o1, Hash1 o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}
