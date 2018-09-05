package assignment4_1;

import java.util.Date;

public class Professor extends DeptEmployee {
	
	public Professor(String name, int salary, Date hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}

	int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}


	
}
