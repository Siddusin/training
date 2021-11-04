package collectionArrayList.MyOwnArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class MyOwnArrayList implements Iterable{
private int position1;
private Object[] arr;
public MyOwnArrayList(int arraySize) {
arr=new Object[arraySize]; 
}
void addArrayElement(Object object) {
	if(position1>=size()) {
		grow();
	}
	arr[position1++]=object;
}
public Object get(int index) {
	return arr[index];
	
}
public int size() {
	return arr.length;
}
@Override
public String toString() {
	if(size()==0) {
		return "[ ]";
	}
	String string="["+arr[0];
	for(int i=1;i<position1;i++) {
		 string+=","+arr[i];
	}
	  string+="]";
	  
	  return string;
}
public void grow() {

	Object temp[]=new Object[arr.length+(arr.length*2)];
	System.arraycopy(arr, 0, temp, 0, position1);
	arr=temp;
}
@Override
public Iterator iterator() {
	// TODO Auto-generated method stub
	return new Itr();
}
private class Itr implements Iterator{
	int index;

	@Override
	public boolean hasNext() {
		return (index<position1)?true:false;
	}

	@Override
	public Object next() {
		return arr[index++];
	}
	
}



}
