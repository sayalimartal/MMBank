//Create savings account and perform various operations like withdraw, deposit, transfer etc.
public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount sayali = new SavingsAccount("Sayali",5000);//Create a savings account with initial balance of Rs.5000
		System.out.println(sayali);
		sayali.withdraw(500);   //Withdraw amount
		System.out.println(sayali); //Show updated balance

		int next = SavingsAccount.getNextAccountNumber();  //Display next account number
		System.out.println("Next account number available is "+next);

		SavingsAccount siddhi = new SavingsAccount("Siddhi");//Create a zero-balance account
		System.out.println(siddhi);
		siddhi.deposit(1000);  	     //Deposit amount
		System.out.println(siddhi);  //Show updated balance

		next = SavingsAccount.getNextAccountNumber();     //Display next account number
		System.out.println("Next account number available is "+next);

		String result = sayali.transaction(siddhi, 500);//Transfer amount from one account to the other
		System.out.println(result);

		System.out.println(sayali);  //Show updated balances
		System.out.println(siddhi);
	}
}