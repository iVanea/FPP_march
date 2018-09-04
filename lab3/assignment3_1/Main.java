package assignment3_1;


public class Main {

	public static void main(String[] args) {
			
		Employee employ = new Employee("Toms", "Aik", 23134, 2000, 9, 4);
	
		Account accChecking = new Account(employ, AccountType.CHECKING, 	300);
		Account accRetirement= new Account(employ, AccountType.RETIREMENT, 400);
		Account accSavings = new Account(employ, AccountType.SAVINGS, 300);
		System.out.println(accChecking.toString());
		System.out.println(accRetirement.toString());
		System.out.println(accSavings.toString());
		
	
	}

}
