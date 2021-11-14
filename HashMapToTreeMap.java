package techno.java.Map;


import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreeMap {
public static void main(String[] args) {
	MapDec dec=new MapDec();
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(301, "Sandesh");
	map.put(304, "ganesh");
	map.put(323, "Gourav");
	map.put(354, "Avinash");
	map.put(332, "Chandru");
	System.out.println(map);
	TreeMap<Integer,String> trm=new TreeMap<Integer,String>(map);
	System.out.println(trm);

}
}
