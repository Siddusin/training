package techno.java.corejava.exception;

import java.util.Scanner;

public class MainExceptionM extends Exception {
public static void main(String[] args) throws MinorException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age1=sc.nextInt();
		AgeForMarriage age=new AgeForMarriage();
		age.agecal1(age1);

		
	}
}


