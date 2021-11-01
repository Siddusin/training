package com.technoelevate.technoelevateassignments.array;

public class ArrayStringSort {

	public static void main(String[] args) {
		String[] strArr = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		int sizeOfArr = strArr.length;
		System.out.print("Original String array : ");
		for (String str: strArr) {
			System.out.print(str+" ");
		}
		System.out.println();
		sortStringArray(strArr,sizeOfArr);

	}
	public static void sortStringArray(String[] strArr, int sizeOfArr) {
		String temp;
		for (int i=0; i<sizeOfArr;i++) {
			for (int j=1; j<sizeOfArr; j++) {
				if (strArr[j-1].compareTo(strArr[j])>0) {
					temp = strArr[j-1];
					strArr[j-1]=strArr[j];
					strArr[j]=temp;
				}
//				for (String str: strArr) {
//					System.out.print("Iteration "+(i+1)+" : "+str+" ");
//					System.out.println();
//				}
			}
		}
		System.out.print("Sorted String array :");
		for (String str: strArr) {
			System.out.print(str+" ");
		}
		//sortStringArray(strArr,sizeOfArr);
	}

}
