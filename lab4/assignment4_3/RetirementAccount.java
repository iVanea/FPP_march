package assignment4_3;

public final class RetirementAccount extends Account {

	private static String ACCOUNT_TYPE;
	private static final double PENALTY = 0.02;

	RetirementAccount(Employee e, double amount) {
		super(e, amount);
		RetirementAccount.ACCOUNT_TYPE = "retirement";
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount: " + amount);
	}

	public void withdraw(double amount) {
		if (this.balance > (amount + (PENALTY * (this.balance - amount)))) {
			balance = balance - amount;
			balance = balance - (PENALTY * balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public String getAcctType() {
		return ACCOUNT_TYPE;
	}

	public double getBalance() {
		// this.balance=this.balance - 5;
		return balance;
	}
}
