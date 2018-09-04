package employeeinfo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

import employeeinfo.Account;
import employeeinfo.AccountType;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDateTime hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate =  LocalDateTime.ofInstant(cal.getTime().toInstant(), ZoneId.systemDefault());			
	}
	
	public String getName() {
		return name;
	}
	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIRMENT, startAmount);		
	}
	
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String getFormattedAcctInfo() {
		String accounts =  checkingAcct.toString() + "\n";
	 	accounts += savingsAcct.toString()+ "\n";
		if(retirementAcct != null) {
			accounts += retirementAcct.toString() + "\n";
		}
		return accounts;
	}
	
	public void deposit(String acctType, double amt){
		if(acctType == "CHECKING") {
			checkingAcct.makeDeposit(amt);
		}else if(acctType == "SAVINGS"){
			savingsAcct.makeDeposit(amt);
		}else {
			retirementAcct.makeDeposit(amt);
		}		
	}
	
	public boolean withdraw(String acctType, double amt){
		boolean withdraw;
		if(acctType == "checking") {
			withdraw = checkingAcct.makeWithdrawal(amt);
		}else if(acctType == "savings"){
			withdraw = savingsAcct.makeWithdrawal(amt);
		}else {
			withdraw = retirementAcct.makeWithdrawal(amt);
		}
		return withdraw;
	}

}
