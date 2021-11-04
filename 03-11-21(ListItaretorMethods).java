package collectionArrayList.listiterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListItaretorMethods {
public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<Object>(10);
	list.add(2);
	list.add("asd");
	list.add(32.4);
	list.add(65);
	
	for(Object obj:list) {
		if(obj.getClass()==Integer.class) {
			System.out.println("I found int :"+obj);
		}
	}
	
	/* System.out.println(list.get(0)); */
	/*
	 * ListIterator lir=list.listIterator(); while(lir.hasNext()) {
	 * System.out.println(lir.next()); System.out.println(lir.nextIndex()); }
	 * ListIterator lir2=list.listIterator(11); while(lir2.hasPrevious()) {
	 * System.out.println(lir2.previous());
	 * System.out.println(lir2.previousIndex()); }
	 */
	/*
	 * set(Object e) remove()
	 */
	
	
}
}
