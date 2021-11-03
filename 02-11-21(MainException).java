package techno.java.corejava.exception.assignmentex;

import java.util.Scanner;

public class MainException  {
public static void main(String[] args) throws UserMinorException {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your Age :");
	int age1=sc.nextInt();
	Age age=new Age(age1);
	age.agecal(age1);

	
}
}
