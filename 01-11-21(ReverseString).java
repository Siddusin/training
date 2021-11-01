package techno.java.assign;

public class ReverseString {
public static void main(String[] args) {
	String string="My Name is Sandesh";
	String array[] = string.split(" ");
	for(int i=array.length-1;i>=0;i--){
		System.out.print(array[i]+" ");
	}
}
}
