package SimpleBankingSystem;
import java.util.Scanner;
import java.util.Random;

class Registration{
	String userName;
	char password[];
	Registration(String userName,char[] Password){
		this.userName= userName;
		this.password = Password; 
		}
}

class BankAccount extends Registration{
	String accountNumber;
	String accountHolderName;
	double balance;
	BankAccount(String accountNumber,String accountHolderName,double balance,String userName , char[] password){
		super(userName,password);
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
	static Scanner sc = new Scanner(System.in);
	static BankAccount BankArr[] = new BankAccount[100];
	static int index=0;
	private static char[] generatePass(){
		String  alpha[] = {"abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ","0123456789","!@#$%^&*()_-?/"};
		char pass[] = new char[9];
		Random r = new Random();
		for(int i=0;i<9;i++) {
			int j = r.nextInt(4);
			pass[i]=alpha[j].charAt(r.nextInt(alpha[j].length()));
			}
		return pass;
	}
	public static void registration(){
		System.out.println("Enter User Name :");
		String name = sc.nextLine();
		System.out.println("User Name: "+name);
		char pass[] = generatePass();
		System.out.println("Generated Password");
		for(char i : pass)
			System.out.print(i);
		System.out.println();
		System.out.println("Enter Account NUmber");
		String ba = sc.next();
		BankArr[index++]=new BankAccount(name,ba,1000,name,pass);
	}
	
	public static BankAccount search(String accno) {
		for(int i=0;i<100;i++) {
			if(BankArr[i].accountNumber.equals(accno)) {
				return BankArr[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Enter an option below");
		System.out.println("1. Registration 2.Deposit 3.Withdraw 4.display 5.search 6.exit");
		int opt= sc.nextInt();
		sc.nextLine();
		switch(opt) {
		case 1: 
			registration();
			break;
		case 2:
			System.out.println("Enter Account no :");
			String accno = sc.nextLine();
			BankAccount obj = search(accno);
			obj.deposit(10000);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			return ;
		}
//		BankAccount account = new BankAccount("123456789","Kotha Ganesh",500.0);
//		account.displayAccountInfo();
//		account.deposit(1000);
//		account.withdraw(200);
//		account.displayAccountInfo();
	}

}
