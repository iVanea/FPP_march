package assignment4_3;

public final class SavingsAccount extends Account {

	private static String ACCOUNT_TYPE;

	SavingsAccount(Employee e, double amount) {
		super(e, amount);
		SavingsAccount.ACCOUNT_TYPE = "savings";
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount: " + amount);
	}

	public void withdraw(double amount) {
		if (this.balance > amount) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public String getAcctType() {
		return ACCOUNT_TYPE;
	}

	public double getBalance() {
		this.balance = this.balance - (this.balance * 0.25);
		return balance;
	}
}
