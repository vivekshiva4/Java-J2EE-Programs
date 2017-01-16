package com;

public class Test {

	public static void main(String[] args) {
		TicketBooking t=new TicketBooking(1);
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		t1.setName("vivek");
		t2.setName("kittu");
		t1.start();
		t2.start();
		
		

	}

}
