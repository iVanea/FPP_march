

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<>();

	public void addEntry(String date, double salary) {

		salaryRecord.put(date, salary);

	}

	public void printPaymentAmount(String date) {

		if (salaryRecord.get(date) != null)
			System.out.println(String.format("%s %s was paid %s on %s\r\n", getFirstName(), getLastName(),
					salaryRecord.get(date), date.toString()));
		else
			System.out.println(String.format("%s %s did not receive a paycheck on %s\r\n", getFirstName(),
					getLastName(), date.toString()));
	}

	public void printAveragePaycheck() {
		Double avg = 0.0;
		int count=0;
		for (Double value : salaryRecord.values()) {
			avg += value;
			count++;
		}
		avg /=count;
		System.out.println(String.format("Average paycheck for %s %s  was %s\r\n", getFirstName(), getLastName(), avg));

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		Random rand = new Random();
		
		for (int i = 1; i <= 12; ++i) {
			int  n = rand.nextInt(50) + 1;
			e.addEntry(i + "/15/2011", 3070 + 5 * n );
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2006");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
