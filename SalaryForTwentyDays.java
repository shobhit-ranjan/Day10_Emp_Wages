package Day10_Emp_Wages;

import java.util.Random;

public class SalaryForTwentyDays {
	static int wagePerHour = 200;
	static int hr,monthlySalary=0;
	

	public static int dailyWage(int amount) {
		return (amount * wagePerHour);
	}

	public static void empIsPresent() {
		Random random = new Random();
		int randomNum = random.nextInt(3);
		switch (randomNum) {
		case 0:
			hr = 0;
			break;
		case 1:
			hr = 4;
			break;
		case 2:
			hr = 8;
			break;
		}
	}
	public static int monthlySalaryOfEmp() {
		for(int i=0; i<20; i++) {
			empIsPresent();
			monthlySalary=monthlySalary+dailyWage(hr);
		}
		System.out.println(monthlySalary);
		return monthlySalary;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Day8 Emp Salary computation Problem");
		empIsPresent();
		
	}

}
