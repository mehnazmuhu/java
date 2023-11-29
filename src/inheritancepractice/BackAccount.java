package inheritancepractice;

public class BackAccount {
	int deposite=40000;
	int withdraw=20000;
	int balance=deposite-withdraw;
	double interest=9.5;
	
	public void depositemoney() {
		System.out.println("Total deposite money is "+ deposite);
	}
	
	public void withdrawmoney() {
		System.out.println("Total withdraw money is " +withdraw);
	}
	public void balancemoney() {
		System.out.println("Total balance money is "+balance);
	}
	
	public void interest(){
	System.out.println		( "Total interest rate is "+ (balance*9.5/100));

}
}