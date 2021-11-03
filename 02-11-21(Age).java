package techno.java.corejava.exception.assignmentex;

import java.util.Scanner;

public class Age {
int age;

public Age(int age) {
	super();
	this.age = age;
}
public static void agecal(int age) throws UserMinorException {

	if(age>=18) {
		System.out.println("You are eligible for Voting");
	}else {
		throw new UserMinorException("UserMinorException");
	}
}
}
