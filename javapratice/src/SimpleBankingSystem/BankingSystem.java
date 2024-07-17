package SimpleBankingSystem;

class BankAccount{
	String accountNumber;
	String accountHolderName;
	double balance;
	BankAccount(String accountNumber,String accountHolderName,double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	void displayAccountInfo() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance+"\n------------------------------------------------------");
	}
	void deposit(double amount) {
		balance += amount;
	}
	void withdraw(double amount) {
		if((balance-amount)<0) {
			System.out.println("Insufficient Balance in your Account");
		}
		else {
			balance-=amount;
			System.out.println("Your available Balance is "+balance+"\n--------------------------------------------------------");
		}
	}
	
}

public class BankingSystem {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789","Kotha Ganesh",500.0);
		account.displayAccountInfo();
		account.deposit(1000);
		account.withdraw(200);
		account.displayAccountInfo();
	}

}
