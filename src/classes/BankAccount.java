package classes;

public class BankAccount {
		
	private double balance;
	
	public BankAccount(double balance){
		this.balance = balance;
	};
	
	public double getBalance(){
		return this.balance;
	};
	
	public void setBalance(double value){
		this.balance = value;
	};
	
	public void depositFunds(double funds){
		this.balance += funds;
	};
	
	public String givesCash(double value){
		if(value < this.balance)
			this.balance -= value;
		return "Not enough funds";
	};
}
