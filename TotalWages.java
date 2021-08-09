package Day10_Emp_Wages;

import java.util.Random;

public class TotalWages {

	static int WAGE_PER_HOUR = 200;
	static int hr, MONTHLY_SALARY_PER_HOUR = 0;
	static int TOTAL_HR = 0;
	static String COMPANY_NAME;
	static int WORKING_HOUR;

	

	public static int dailyWage(int amount) {
		return (amount * WAGE_PER_HOUR);
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
		while (i < 20 && TOTAL_HR < 100) {
			empIsPresent();
			MONTHLY_SALARY_PER_HOUR += dailyWage(hr);
			TOTAL_HR += hr;

		}
		return MONTHLY_SALARY_PER_HOUR;
	}

	public void TotalWages(String companyName, int workingDays, int totalWorkingHr, int wagesPerHour) {
		this.COMPANY_NAME = companyName;
		this.WORKING_HOUR = workingDays;
		this.TOTAL_HR = totalWorkingHr;
		this.WAGE_PER_HOUR = wagesPerHour;
	}

}
