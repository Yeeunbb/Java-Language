import java.util.Date;
import java.util.Scanner;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		set_date();
	}
	
	Account(int i, double b, double air){
		id = i;
		balance = b;
		annualInterestRate = air;
		set_date();
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
	}
	
	void deposit(double d) {
		balance += d;
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
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account MyAccount = new Account();
		int ID = input.nextInt();
		double Balance = input.nextDouble();
		double AIR = input.nextDouble();
		double Withdraw = input.nextDouble();
		double Deposit = input.nextDouble();
		
		MyAccount.set_id(ID);
		MyAccount.set_balance(Balance);
		MyAccount.set_AIR(AIR);
		MyAccount.withdraw(Withdraw);
		MyAccount.deposit(Deposit);
		
		System.out.println("balance: " + MyAccount.get_balance());
		System.out.println("monthly interest: " + MyAccount.getMontlyInterest());
		System.out.println("the time is: " + MyAccount.get_date());
		
		input.close();
	}

}
