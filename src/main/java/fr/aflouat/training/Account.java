package fr.aflouat.training;

public class Account {
	private double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public void credit(double amount) {
		if (amount > 0) this.balance +=amount;
	}
	public void debit(double amount) {
		if (amount > 0) this.balance -=amount;
	}
	
	public double getBalance() {
		return this.balance;
	}

}
