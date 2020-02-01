import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		int balance = input.nextInt();
		int id = input.nextInt();
		int n = input.nextInt();
		
		Account myAccount = new Account(name, id, balance, 1.5);
		for(int i=0; i<n; i++) {
			String order = input.next();
			
			if(order.equals("Deposit")) {
				int money = input.nextInt();
				myAccount.deposit(money);
			}
			else {
				int money = input.nextInt();
				myAccount.withdraw(money);
			}
		}
		
		System.out.println("Name: " + myAccount.name);
		System.out.println("Annual interest rate: " + myAccount.get_AIR());
		System.out.println("Balance: " + myAccount.get_balance());
		System.out.println("Date Type Amount");
		for(int i=0; i<n; i++) {
			Transaction now = myAccount.transactions.get(i);
			System.out.println(now.getType() +" "+ now.getAmount() +" "+ now.getBalance());
		}
		
		input.close();
	}
}

class Account{
	String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	ArrayList<Transaction> transactions;
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		set_date();
	}
	
	Account(String n, int i, double b, double air){
		name = n;
		id = i;
		balance = b;
		annualInterestRate = air;
		set_date();
		transactions = new ArrayList<>();
	}
	
	double getMonthlyInterestRate() {
		double Rate = get_AIR() / 12 / 100;
		return Rate;
	}
	
	double getMontlyInterest() {
		double result = Math.floor(balance*getMonthlyInterestRate()*1000);
		return result / 1000;
	}
	
	void withdraw(double w) {
		balance -= w;
		transactions.add(new Transaction('W', w, balance,""));
	}
	
	void deposit(double d) {
		balance += d;
		transactions.add(new Transaction('D', d, balance,""));
	}

	public void set_date() {
		this.dateCreated = new java.util.Date();
	}
	
	public String get_date() {
		return dateCreated.toString();
	}
	
	public void set_id(int i) {
		this.id = i;
	}
	
	public int get_id() {
		return id;
	}
	
	public void set_balance(double b) {
		this.balance = b;
	}
	
	public double get_balance() {
		return balance;
	}
	
	public void set_AIR(double a) {
		this.annualInterestRate = a;
	}
	
	public double get_AIR() {
		return annualInterestRate;
	}
}

class Transaction{
	char type;
	double amount;
	double balance;
	String description;
	
	Transaction(char t, double a, double b, String d){
		type = t;
		amount = a;
		balance = b;
		description = d;
	}
	
	char getType() {
		return type;
	}
	
	double getAmount() {
		return amount;
	}
	
	double getBalance() {
		return balance;
	}
	
	String getDescription() {
		return description;
	}
}