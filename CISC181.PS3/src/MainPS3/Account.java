package MainPS3;

import java.util.Calendar;

public class Account {

	private int ID;
	
	protected double Balance;
	
	private double annualInterestRate;
	
	private Calendar dateCreated;
	
	Account(){
		this.ID = 0;
		this.Balance = 0;
		this.annualInterestRate = 0;
		
	}
	
	Account(int ID, double Balance, double annualInterestRate){
		this.ID = ID;
		this.Balance = Balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getID() {
		return ID;
	}

	public double getBalance() {
		return Balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Calendar getdateCreated(){
		return dateCreated;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	double withdraw(double amount){
		return Balance -= amount;
	}
	
	double deposit(double amount){
		return Balance += amount;
	}

	public static void main(String[] args) {
		Account Test = new Account(1122, 20000.00, .045);
		Test.withdraw(2500.00);
		Test.deposit(3000.00);
		System.out.println("Balance: " + Test.Balance);
        System.out.println("Monthly Interest: " + Test.getMonthlyInterestRate());
        System.out.println("Account created on: " + Test.getdateCreated());
	}
}
