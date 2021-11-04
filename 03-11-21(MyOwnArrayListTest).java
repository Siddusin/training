package collectionArrayList.MyOwnArrayList;

import java.util.Iterator;
import java.util.Scanner;


public class MyOwnArrayListTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int size1=sc.nextInt();
	MyOwnArrayList arrayList=new MyOwnArrayList(size1);
	arrayList.addArrayElement(0);
	arrayList.addArrayElement(1);
	arrayList.addArrayElement(2);
	arrayList.addArrayElement(3);
	arrayList.addArrayElement(4);
	arrayList.addArrayElement(5);
	arrayList.addArrayElement(6);
	arrayList.addArrayElement(7);
	arrayList.addArrayElement(8);
	System.out.println(arrayList);
	System.out.println(arrayList.size());
	Iterator iterator=arrayList.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}

	
	
}
}
