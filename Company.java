package BankSalary;

public class Company extends Thread{
	int money;
	Bank bank;

	public Company(int money, Bank bank) {
		super();
		this.money = money;
		this.bank = bank;
	}

	@Override
	public void run() {
		
	bank.addingMoney(money);	
	}
}
