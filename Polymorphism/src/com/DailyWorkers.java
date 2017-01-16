package com;

public class DailyWorkers extends Workers {

	@Override
	public void pay() {

		name = "vivek";
		salaryRate = 300;
		noOfWorkedDays = 6;
		double salary = noOfWorkedDays * salaryRate;
		System.out.println("salary of daily worker per week is  :" + salary);

	}

}
