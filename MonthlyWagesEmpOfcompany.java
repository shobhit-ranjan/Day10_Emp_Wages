package Day10_Emp_Wages;

import java.util.Random;

public class MonthlyWagesEmpOfcompany {

	public static void main(String[] args) {

		System.out.println("Welcome to  Emp Salary computation Problem");
		TotalWage Employee = new TotalWage("Genral Electric", 20, 110, 500);
		System.out.println("Monthly wages of an Employee is " + Employee);
	}

}

class TotalWage {

	static int wagePerHour = 200;
	static int hr, monthlySalaryEmp = 0;
	static int totalHr = 0;
	static String companyName;
	static int workingDays;

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

	public TotalWage(String companyName, int workingDays, int totalWorkingHr, int wagesPerHour) {
		this.companyName = companyName;
		this.workingDays = workingDays;
		this.totalHr = totalWorkingHr;
		this.wagePerHour = wagesPerHour;
	}

}
