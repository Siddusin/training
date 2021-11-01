package techno.java.assign;

import java.util.Scanner;

public class FectorialUsingMethodRecursion {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number to find the Factorial :");
	int n=sc.nextInt();
	int fact=findFactorial(n);
	System.out.println("Factorial of "+n+" is : "+fact);
}

private static int findFactorial(int n) {
	if(n>0)
		return n=n*findFactorial(n-1);
	else
	return 1;
}
}
