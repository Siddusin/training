package techno.JavaAssignment.ArraysClassForEachMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayClassForEachMethod {
public static void main(String[] args) {
	String [] a= {"Sandesh","Gourav","Vijay","Avinash","Manisha"};
	List<String> list=Arrays.asList(a);
	Collections.sort(list);
	list.forEach(arr->System.out.println(arr));
}
}
