package BankSalary;

public class Employee extends Thread {
Bank bank;
int money;

 
 
	public Employee(Bank bank, int money) {
	super();
	this.bank = bank;
	this.money = money;
}



	@Override
	public void run() {
		
	try {
		bank.debiting(money);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
