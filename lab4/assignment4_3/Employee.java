package assignment4_3;

import java.time.LocalDate;

public class Employee {

	public String name;
	// Account savings;
	// Account retirement;
	// Account checking;
	AccountList accounts;
	LocalDate hireDate;

	int flag1, flag2, flag3;

	Employee(String name, int year, int month, int day) {
		this.name = name;
		this.hireDate = LocalDate.of(year, month, day);
		accounts = new AccountList();
	}

	public void createNewChecking(double startAmount) {
		Account acct = new CheckingAccount(this, startAmount);
		// accounts = new AccountList();
		accounts.add(acct);
		flag1++;
	}

	public void createNewSavings(double startAmount) {
		Account acct = new SavingsAccount(this, startAmount);
		// accounts = new AccountList();
		accounts.add(acct);
		flag2++;
	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAccount(this, startAmount);
		// accounts = new AccountList();
		accounts.add(acct);
		flag3++;
	}

	public void makeDeposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public void withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.withdraw(amt);
	}

	public String getFormattedAcctInfo(int x, int y) {
		String str = accounts.toString(x, y);
		return str;
	}

	public String getName() {

		return this.name;
	}

}
