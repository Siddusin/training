package com.technoelevate.technoelevateassignments.methods;
import java.util.Scanner;
public class MethodPrintEqual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2=scanner.nextInt();
		System.out.println("Enter third number: ");
		int num3=scanner.nextInt();
		printEqual(num1, num2, num3);
	}
	public static void printEqual(int num1,int num2, int num3) {
		System.out.println("Given numbers are: "+num1+" "+num2+" "+num3);
		if (num1<0||num2<0||num3<0) {
			System.out.println("Invalid values");
		}
		else if (num1==num2&&num2==num3) {
			System.out.println("All numbers are equal");
		}
		else if (num1!=num2&&num2!=num3) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal nor different");
		}
	}

}
