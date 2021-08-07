package Day10_Emp_Wages;

import java.util.Random;

public class Employeeattendence {
	
	static int flag=0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Salary Mangement And Attendence");
		
		Attendence();
		

	}

	public static void Attendence() {

		Random randome = new Random();
		int presentOrAbsent = randome.nextInt(2);

		if (presentOrAbsent == 0) {
			System.out.println("Employee is Present");
			flag=1;
		} else {
			System.out.println("Employee is Absent");
		}
		Salary();
	}
	public static void Salary() {
		int wagePerHour=20;
		int workinghour=8;
		if(flag==1)
		{
			int salaryForDay=wagePerHour*workinghour;
			System.out.println("your Salary is " + salaryForDay);
		}
		else
		{
			System.out.println("No Salary for Today you Were Absent");
		}
		
	}

}
