package com;

public class Test {

	public static void main(String[] args) {
		CarRegistration c = new CarRegistration();
		c.setRegNo(10258);
		c.setCompanyName("hundai");
		c.setOwnerName("kittu");

		c.display();

		CarRegistration c2 = new CarRegistration();
		c2.setRegNo(2586);
		c2.setCompanyName("suziki");
		c2.setOwnerName("vivek");
		c2.display();

	}

}
