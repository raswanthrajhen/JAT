package Task10;

import java.math.BigDecimal;

public class BankAcount {
	private String accountHolderName;
	private Double balance;
	
	//No Argument Constructor
	public BankAcount() {
		this.accountHolderName="Raswanth";
		this.balance=0.0;	
	}
	
	//Two Argument Constructor
	public BankAcount(String name,Double balance ) {
		this.accountHolderName=name;
		this.balance=balance;
	}
	
	
	//WithDraw from Bank Account
	public void withdraw(Double amount) {
		if(balance>amount) {
		balance=balance-amount;
		System.out.println("The current balance is" +balance);
		}
		else
			System.out.println("The current balance is in sufficient");
	}
	
	//Deposit to the bank Account
	public void deposit(Double amount) {
		balance=balance+amount;
		System.out.println("The current balance is" +balance);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcount raswantAccountOne=new BankAcount();
		raswantAccountOne.deposit(100000.00);
		raswantAccountOne.withdraw(12000.00);
		
		BankAcount raswantAccountTwo=new BankAcount("Rajhen",50000.00);
		raswantAccountTwo.deposit(100000.00);
		raswantAccountTwo.withdraw(12000.00);
		
		
		
		
	}

}
