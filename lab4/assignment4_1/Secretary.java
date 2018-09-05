package assignment4_1;

import java.util.Date;

public class Secretary extends DeptEmployee {

	double overtimeHours;
	
	public int computeSalary() {
		return (int) (super.getSalary() +12*overtimeHours);
	}

	@Override
	public int getSalary() {
		return computeSalary();	
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public Secretary(String name, int salary, Date hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	
}
