package Day10_Emp_Wages;

import java.util.Random;

public class Parttimeemployee {

	static int flag = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Salary Mangement And Attendence");

		Attendence();

	}

	public static void Attendence() {

		Random randome = new Random();
		int presentOrAbsent = randome.nextInt(3);

		if (presentOrAbsent == 0) {
			System.out.println("Employee is Present");
			flag = 1;
		} else if (presentOrAbsent == 1) {
			System.out.println("Employee is present for half day");
			flag = 2;
		} else {
			System.out.println("Employee is Absent");
		}
		Salary();
	}

	public static void Salary() {
		int wagePerHour = 20;
		int workinghour = 8;
		int workingForHalfDay=4;
		if (flag == 1) {
			int salaryForDay = wagePerHour * workinghour;
			System.out.println("your Salary is " + salaryForDay);
		} else if(flag==2) {
			int salaryForDay = wagePerHour*workingForHalfDay;
			System.out.println("your Salary is " + salaryForDay);
		}
		else
		{
			System.out.println("No Salary for today");
		}

	}

}