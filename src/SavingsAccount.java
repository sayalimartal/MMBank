//Creates a Savings Account
public class SavingsAccount {
	private int accountNumber = 0;
	private String name;
	private double balance=0;
	private static int lastAccountNumber = 0;

	//Create account with basic details   
	public SavingsAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}

	//Create account with zero balance
	public SavingsAccount(String name) {
		this.name = name;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}

	//Withdraw amount from account
	public void withdraw(double amount) {
		if(this.balance > amount && amount>0)
			this.balance -= amount;
	}

	//Deposit amount to account
	public void deposit(double amount) {
		if(amount > 0)
			this.balance +=amount;
	}

	//Find next account number if a person opens an account in the bank
	public static int getNextAccountNumber() {
		return lastAccountNumber + 1;
	}

	//Transfer amount from one account to another 
	public String transaction(SavingsAccount receiver, double amount) {
		if(PaymentGateway.transfer(this, receiver, amount)) 
			return "Payment Successful";
		else 
			return "Payment Failed";
	}

	//Display account details
	@Override
	public String toString() {
		return "SavingsAccount [account number = " +accountNumber+ " name = " + name + ", balance = " + getBalance() + "]";
	}	
}