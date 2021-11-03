package techno.java.assign.calculator;

public class Calculator {
public double numberOne;
public double numberTwo;
public Calculator(double numberOne, double numberTwo) {
	super();
	this.numberOne = numberOne;
	this.numberTwo = numberTwo;
}
public double add(double number1,double number2) throws AddException {
	if(number1>0&&number2>0) {
		double result = number1+number2;
	return result;
	}else {
		throw new AddException("AddException");
	}
	
}
public double subtract(double number1,double number2) throws SubtractException {
	if(number1>0&&number2<number1&&number2>0) {
		double result = number1-number2;
	return result;
	}else {
		throw new SubtractException("SubtractException");
	}
	
}
public double division(double number1,double number2) throws DivisionException {
	if(number1>0&&number2<number1&&number2>0) {
		double result = number1-number2;
	return result;
	}else {
		throw new DivisionException("DivisionException");
	}
	
}
public double Multiplication(double number1,double number2) throws MultiplicationException {
	if(number1>0&&number2>0) {
		double result = number1*number2;
	return result;
	}else {
		throw new MultiplicationException("MultiplicationException");
	}
	
}

}
