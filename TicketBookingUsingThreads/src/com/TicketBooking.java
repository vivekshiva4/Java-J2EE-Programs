package com;

public class TicketBooking extends Thread {
	@Override
	public void run() {
		bookTicket();
	}

	int noOfSeats = 1;
	int booking;

	public TicketBooking(int booking) {

		this.booking = booking;
	}

	public synchronized void bookTicket() {
		if (noOfSeats >= booking) {
			String tname = Thread.currentThread().getName();
			System.out.println("ticket is booking for " + booking + " seat to " + tname);
			noOfSeats = noOfSeats - booking;
			System.out.println("ticket is booked for "  + tname);

		} else {
			System.out.println(" sorry for the inconvinence Tickets has been sold out ");
		}
	}

}
