package assignment4_3;

public final class CheckingAccount extends Account {

	private static String ACCOUNT_TYPE;

	CheckingAccount(Employee e, double amount) {
		super(e, amount);
		CheckingAccount.ACCOUNT_TYPE = "checking";
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount: " + amount + "\n");
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
		this.balance = this.balance - 5;
		return balance;
	}

}
