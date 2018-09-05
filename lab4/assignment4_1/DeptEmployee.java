package assignment4_1;

import java.util.Date;

public class DeptEmployee {
	protected String name;
	protected int salary;
	protected Date hireDate;
	
	public DeptEmployee(String name, int salary, Date hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public int computeSalary() {
		return salary;
	}
	
}
