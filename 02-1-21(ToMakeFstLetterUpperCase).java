package techno.java.assign.StringArrayOpr;
import java.io.IOException;

public class ToMakeFstLetterUpperCase {
public static void main(String[] args) throws IOException {
	String str= "my name is sandesh";
	String array[]=str.split(" ");
	for(int i=0;i<array.length;i++) {
		String st=array[i];
	    String s1 = st.substring(0, 1).toUpperCase();
	    String rst = s1 + st.substring(1);
	    System.out.print(rst);
	}
}

}
