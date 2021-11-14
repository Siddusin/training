package BankSalary;

public class BankMain {
	public static void main(String[] args) throws InterruptedException {
		Bank bank=new Bank(50000);
		new Employee(bank, 30000).start();
		new Employee(bank, 35000).start();
		Thread.sleep(1000);
		new Company(100000, bank).start();
	}
}
