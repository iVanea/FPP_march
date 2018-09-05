package assignment4_3;

abstract class Account {

	double balance;
	Employee emp;

	Account(Employee e, double balance) {
		this.balance = balance;
		this.emp = e;
	}

	abstract void makeDeposit(double amount);

	abstract public void withdraw(double amount);

	abstract String getAcctType();

	abstract public double getBalance();

}
