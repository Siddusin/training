package techno.java.corejava.exception;
import java.util.Scanner;
public class AgeForMarriage {

	

	
	int age;

	public  AgeForMarriage() {
		super();
		this.age = age;
	}
	public static void agecal1(int age) throws MinorException {

		if(age>=18) {
			System.out.println("You are eligible for Marriage");
		}else {
			throw new MinorException("MinorException");
		}
	}
	}

