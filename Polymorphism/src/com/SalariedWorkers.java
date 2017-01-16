package com;

public class SalariedWorkers extends Workers {

	
@Override
public void pay() {
	name = "kittu";
	salaryRate = 3;
	noOfHours = 36;
	double salary = noOfHours * salaryRate;
	System.out.println("salary of salarird worker per week is  :" + salary);
}
}
