package BankSalary;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Bank {
	int money;

	public Bank(int product) {
		super();
		this.money = product;
	}

	public synchronized void addingMoney(int money) {
		LocalTime dateTime=LocalTime.now();
		this.money += money;
		System.out.println("\nMoney Added Successfully");
		System.out.println("Available balance is :" + this.money+"  "+dateTime);
		this.notify();
	}

	public synchronized void debiting(int items) throws InterruptedException {
		LocalDateTime dateTime=LocalDateTime.now();
		if (money < items) {
			String str = "Inseficient Balance in Company Account \nPlease Wait!!!!!\n  "+dateTime+"  \nLoading Money to Comapany Acoount";
			char[] ch = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				ch[i] = str.charAt(i);
			}
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
				Thread.sleep(80);

			}

			this.wait();
		}
		money -= items;
		/*
		 * String Str="Money is Paid for Employee"; String [] arr=Str.split(" ");
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]); Thread.sleep(100);
		 * }
		 */
		 System.out.println("Money is Paid for Employee  "+dateTime); 
		System.out.println("Available Balance is :" + money);
	}
}
