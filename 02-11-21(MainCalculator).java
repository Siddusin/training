package techno.java.assign.calculator;

import java.util.Scanner;

public class MainCalculator {
public static void main(String[] args) throws AddException, SubtractException, DivisionException, MultiplicationException {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter First Number :");
	double FirstNum=sc.nextDouble();
	System.out.println("Enter Second Number :");
	double SecondNum=sc.nextDouble();
	Calculator calculator=new Calculator(FirstNum, SecondNum);
	System.out.println("Which Operation you want to perform \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
	int which=sc.nextInt();
	switch(which) {
	case 1:System.out.println(FirstNum +" + "+SecondNum+" = "+calculator.add(FirstNum, SecondNum)); break;
	case 2:System.out.println(FirstNum +" - "+SecondNum+" = "+calculator.subtract(FirstNum, SecondNum)); break;
	case 3:System.out.println(FirstNum +" / "+SecondNum+" = "+calculator.division(FirstNum, SecondNum)); break;
	case 4:System.out.println(FirstNum +" * "+SecondNum+" = "+calculator.Multiplication(FirstNum, SecondNum)); break;
	default :System.out.println("Invalid Input");
	}	
}
}
