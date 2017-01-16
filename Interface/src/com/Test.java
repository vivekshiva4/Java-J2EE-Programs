package com;

public class Test {

	public static void main(String[] args) {
		
		Cashier c=new Bank();
		c.openAccount("vivek");
		
		Customer c2=new Bank();
		c2.depositAmount(1000);
		c2.withdrawnAmmount(500);
       
		Manager m=new Bank();
		m.lockerAceess();
		
		Clerk cc=new Bank();
		cc.service();
	}

}
