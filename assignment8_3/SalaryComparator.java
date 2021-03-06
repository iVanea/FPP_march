package assignment8_3;

import java.sql.Date;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = (Date) e1.getHireDate();
		Date hireDate2 = (Date) e2.getHireDate();
		double salary1 = e1.getSalary();
		double salary2 = e2.getSalary();

		if (salary1 < salary2) {
			return -1;
		} else if (salary1 > salary2) {
			return 1;
		}

		if (name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}

		// now name1 equals name2
		if (hireDate1.compareTo(hireDate2) != 0) {
			return hireDate1.compareTo(hireDate2);
		}

		return 0;
	}
}
