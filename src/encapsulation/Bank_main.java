package encapsulation;

public class Bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount ba =new BankAccount(40000.00);
        ba.deposite(20000.00);
        System.out.println("Balance after deposite is "+ ba.getBalance());
        ba.withdraw(10000.00);
        System.out.println("Balance after withdraw is "+ba.getBalance());
       ba.setBalance(20000.00);
       System.out.println(ba.getBalance());
  
   
	}

	

}
