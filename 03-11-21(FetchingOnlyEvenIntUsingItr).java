

package collectionArrayList.listiterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class FetchingOnlyEvenIntUsingItr {
public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<Object>(10);
	list.add(2);
	list.add("asd");
	list.add(32.4);
	list.add(62);
	list.add(6);
	list.add(80);
	list.add(97);
	
	for(Object obj:list) {
		if(obj.getClass()==Integer.class) {
			int x = Integer.parseInt(obj.toString());
			if(x%2==0) {
			System.out.println("I found even Num :"+x);
			}
		}
	}
	
}}