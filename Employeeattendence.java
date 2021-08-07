package Day10_Emp_Wages;

import java.util.Random;

public class Employeeattendence {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Salary Mangement And Attendence");
		
		Attendence();

	}

	public static void Attendence() {

		Random randome = new Random();
		int presentOrAbsent = randome.nextInt(2);

		if (presentOrAbsent == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
