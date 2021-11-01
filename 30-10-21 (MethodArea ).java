package com.technoelevate.technoelevateassignments.methods;
import java.util.Scanner;
public class MethodArea {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius=scanner.nextDouble();
		double recSide1=scanner.nextDouble();
		double recSide2=scanner.nextDouble();
		System.out.println("Area of circle with radius "+radius+" is : "+area(radius));
		System.out.println("Area of rectangle with sides "+recSide1+" and "+recSide2+" is : "+area(recSide1,recSide2));
	}
	public static double area(double radius) {
		if (radius<0) {
			return (-1.0);
		}
		double area;
		area=3.14*(radius*radius);
		return area;
	}
	public static double area (double recSide1,double recSide2) {
		if (recSide1<0||recSide2<0) {
			return(-1.0);
		}
		double area;
		area=recSide1*recSide2;
		return area;
	}
}
