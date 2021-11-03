package techno.java.assign.TryCatch;

import java.util.Scanner;
/*-program on try-catch-return 
“My name is megha \nI am 34 yrs old\n My son’s name is Shaurya”*/
		

public class TryCatch {
public static void main(String[] args) {

	try {
		System.out.println("My Name is Megha");
		int z=10/0;
	}catch(Exception e) {
		System.out.println("My age is 34");
	}finally {
		System.out.println("My son name is Sourya");
	}
}
}
