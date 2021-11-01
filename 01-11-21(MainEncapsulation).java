package techno.java.assign.EncapsulationProgram;

import java.util.Scanner;

public class MainEncapsulation extends TechnoEncapsulation {


	public MainEncapsulation(String company, int empid, String name, double timein, double timeout,
			String topicLearnt) {
		super(company, empid, name, timein, timeout, topicLearnt);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Company Name :");
		String company=sc.nextLine();
		System.out.println("Enter the EmpId Number :");
		int empid=sc.nextInt();
		System.out.println("Enter the Employee Name :");
		String emp=sc.next();
		System.out.println("Enter the Login time :");
		double timein=sc.nextDouble();
		System.out.println("Enter the Logout time :");
		double timeout=sc.nextDouble();
		System.out.println("Enter theTopic Learnt upto :");
		String topic=sc.next();
		MainEncapsulation encapsulation=new MainEncapsulation(company, empid, emp, timein, timeout, topic);
		System.out.println("The Company Name :"+encapsulation.getCompany());
		System.out.println("EmpId :"+encapsulation.getEmpid());
		System.out.println("Employee Name :"+encapsulation.getName());
		System.out.println("Login time :"+encapsulation.getLogintime()+"AM");
		System.out.println("Logout time :"+encapsulation.getLogouttime()+"PM");
		System.out.println("Topic Learnt upto :"+encapsulation.getTopicLearnt());
	}

}
