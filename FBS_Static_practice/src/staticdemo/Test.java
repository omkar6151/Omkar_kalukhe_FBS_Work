package staticdemo;

class BankAccount{
	double AccNo;
	String name;
	double balance;
	static double interestRate;
	
	static {
		interestRate = 6.5;
	}
	
	BankAccount() {
		AccNo = 00;
		this.name = "not given";
		this.balance = 00;
		
	}
	
	BankAccount(double accNo, String name, double balance) {
		AccNo = accNo;
		this.name = name;
		this.balance = balance;
		
	}

	double getAccNo() {
		return AccNo;
	}

	void setAccNo(double accNo) {
		AccNo = accNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getInterestRate() {
		return interestRate;
	}

	static void  setInterestRate(double ir) {
		interestRate = ir;
	}
	
	void display() {
		System.out.println("Account number: "+this.AccNo);
		System.out.println("Account holder name: "+this.name);
		System.out.println("Bank Balance: "+this.balance);
		System.out.println("Interest Rate: "+interestRate);
	}
}

public class Test {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101,"omkar",1000);
		b1.display();
		System.out.println();
		BankAccount b2 = new BankAccount(201,"akshay",2000);
		b2.display();
		System.out.println();
		BankAccount b3 = new BankAccount(301,"yogesh",3000);
		b3.display();
		System.out.println();
		
		BankAccount.setInterestRate(8.5);
		
		
		b1.display();
		System.out.println();
		b2.display();
		System.out.println();
		b3.display();
		

	}

}
