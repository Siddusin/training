package com.technoelevate.technoelevateassignments.array;
import java.util.Scanner;
public class ArrayIntOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.println("Enter array elements : ");
		for (int i=0; i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.print("Array elements : ");
		for (int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int countPos=0;
		int countNeg=0;
		int countEven=0;
		int countOdd=0;
		int count0=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				countPos++;
			}
		}
		System.out.println("Number of positive numbers in the array : "+countPos);
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<0) {
				countNeg++;
			}
		}
		System.out.println("Number of negative numbers in the array : "+countNeg);
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				countEven++;
			}
		}
		System.out.println("Number of even numbers in the array : "+countEven);
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2!=0) {
				countOdd++;
			}
		}
		System.out.println("Number of odd numbers in the array : "+countOdd);
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==0) {
				count0++;
			}
		}
		System.out.println("Number of 0s in the array : "+count0);
	}

}
