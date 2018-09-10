package assignment8_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee[] empArray = {
				new Employee("George", 40000, 1996,11,5),
				new Employee("Dave", 50000, 2000, 1, 3),
				new Employee("Richard", 45000, 2001, 2, 7)
		};
		
		List<Employee> empList = Arrays.asList(empArray);
		
		
//		NameComparator nameComp = new NameComparator();
		SalaryComparator nameComp = new SalaryComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList+" Was Sorted by Salary.");
		
		
//		HireDateComparator nameComp = new HireDateComparator();
//		Collections.sort(empList, nameComp);
//		System.out.println(empList+" Was Sorted by HireDate.");
		
		
	}
//	public EmployeeSort() {
//		Employee[] empArray =
//			{new Employee("George", 40000, 1996,11,5),
//			 new Employee("Dave", 50000, 2000, 1, 3),
//			 new Employee("Richard", 45000, 2001, 2, 7)};
//		List<Employee> empList = Arrays.asList(empArray);
//		NameComparator nameComp = 
//			new NameComparator();
//		Collections.sort(empList, nameComp);
//		
//		System.out.println(empList);
//		
//	}

}
