package Day10_Emp_Wages;

import java.util.Random;

public class Monthlywages {
	static int wagePerHour = 200;
	static int hr,monthlySalaryEmp=0;
	static int totalHr=0;
	

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
		int i = 0;
		while (i < 20 && totalHr < 100) {
			empIsPresent();
			monthlySalaryEmp += dailyWage(hr);
			totalHr += hr;
			
		}
		return monthlySalaryEmp;
	}


	public static void main(String[] args) {

		System.out.println("Welcome to  Emp Salary computation Problem");
		empIsPresent();
		
	}

}