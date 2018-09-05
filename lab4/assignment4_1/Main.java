package assignment4_1;

import java.util.Date;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String [] args)
	{
		Date d = new Date();
		d.setDate(02);
		d.setMonth(9);
		d.setYear(2002);;
									//name, 		salary,date
		Professor p1 = new Professor("Tim Cook", 2000, d);
		Professor p2 = new Professor("John Ive",2001,d);
		Professor p3 = p1;
		p3.setName("Bill the Gate");
		
		p1.numberOfPublications = 10;
		p3.numberOfPublications = p2.numberOfPublications = 10;
		
		
		Secretary s1 = new Secretary("Big Bob", 5000,d);
		Secretary s2 = new Secretary("Brick Wall",1989, d);
		s1.setOvertimeHours(12);
		s2.setOvertimeHours(12);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s2;
		department[4] = s1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			int sum = 0;
			for (DeptEmployee dept : department) {
				sum += dept.getSalary();
				System.out.println(dept.getSalary());
			}
			System.out.println("=========\nThe sum is:"+ sum);
		}
		else {
		
		}
		
		sc.close();
		
			
	}
}
