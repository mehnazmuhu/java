package encapsulation;

public class BankAccount {
	
	private double balance;
    public BankAccount(double initialbalance) {
	this.balance=initialbalance;
}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposite money "+ amount);
		}
		else {
			System.out.println("Invalid deposite amount");
		}
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("withdraw money "+amount);
		}
		else {
			System.out.println("Invalid withdrawal money or insufficient funds.");
		}
	}
	
	
	

}
