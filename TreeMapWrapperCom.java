package techno.JavaAssignment.TreeMapAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWrapperCom{






	public static void main(String[] args) {
        TreeMap<MainTree, Integer>map=new TreeMap<>();
		map.put(new MainTree(123, "Sandy"),55);
		map.put(new MainTree(145, "John"),15);
		map.put(new MainTree(135, "Rock"),96);
		map.put(new MainTree(156, "Ram"),13);
		map.put(new MainTree(234, "Sham"),78);
		 TreeMap<MainTree, Integer>map1=new TreeMap<>(new TreeMapWrapper());
		 map1.putAll(map);
		 System.out.println(map);
		 System.out.println(map1);
		
	}





	}


