package employeeinfo;

import employeeinfo.AccountType;
import employeeinfo.Employee;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
		
	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType + "\nCurrent bal: " + balance;
	}
	
	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
}
