package techno.JavaAssignment.SetArraySort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

	public class SetArraySortList {
	public static void main(String[] args) {
		List<Integer> set =new LinkedList<Integer>();
		set.add(175);
		set.add(54);
		set.add(80);
		set.add(65);
		set.add(86);
		Collections.sort(set);
	set.forEach(itr->System.out.print(itr+" "));
	}
	}
