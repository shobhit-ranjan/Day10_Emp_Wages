package Day10_Emp_Wages;

import java.util.Random;

public class EmployeeWithSwtich {

	static int flag = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Salary Mangement And Attendence");

		Attendence();

	}

	public static void Attendence() {

		Random randome = new Random();
		int presentOrAbsent = randome.nextInt(3);

		

		switch (presentOrAbsent) {
		case 0:
			System.out.println("Employee is Present");
			flag = 1;
			break;
		case 1:
			System.out.println("Employee is present for half day");
			flag = 2;
			break;

		default:
			System.out.println("Employee is Absent");
			break;
		}
		Salary();
	}

	public static void Salary() {
			int wagePerHour = 20;
			int workinghour = 8;
			int workingForHalfDay=4;
			int salaryForDay;
			
			switch (flag) {
			case 1:
				 salaryForDay = wagePerHour * workinghour;
				System.out.println("your Salary is " + salaryForDay);
				
				
				break;
				
			case 2:
				 salaryForDay = wagePerHour * workingForHalfDay;
				System.out.println("your Salary is " + salaryForDay);
				
				
				break;	

			default:
				System.out.println("No Salary for today");
				break;
			}

		}

}