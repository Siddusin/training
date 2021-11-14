package techno.JavaAssignment.LinkedHashSetCom;

import java.util.Comparator;
import java.util.LinkedHashSet;

public class LinkedHashSetComparator implements Comparator<LinkedHashSetCom> {

	@Override
	public int compare(LinkedHashSetCom o1, LinkedHashSetCom o2) {
		
		return o2.id-o1.id;
	}
	
}
