package MainPS3;

public class Test extends Account{
	public static void main(String[] args) {
		Account Test = new Account(1122, 20000.00, .045);
		Test.withdraw(2500.00);
		Test.deposit(3000.00);
		System.out.println("Balance: " + Test.Balance);
        System.out.println("Monthly Interest: " + Test.getMonthlyInterestRate());
        System.out.println("Account created on: " + Test.getdateCreated());
	}

}
