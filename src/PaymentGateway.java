//Implementation of Payment Gateway
public class PaymentGateway {
	//method to transfer the given amount from the source to target account.
	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, double amount) 
	{
		//If the sender account balance = the given amount then the amount is 
		//transferred from the sender to the receiver account and true is returned
		//otherwise false is returned.
		boolean success;
		if(sender.getBalance() >= amount) {
			sender.withdraw(amount);
			receiver.deposit(amount);
			success = true;
		}
		else
			success = false;
		return success;
	}
}