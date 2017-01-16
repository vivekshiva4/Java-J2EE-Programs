package com;

public class Bank implements Manager, Customer, Cashier, Clerk {

	public void openAccount(String name) {
		System.out.println(name + "  Account has been Opened.");
	}

	public void closeAccount(String name) {
		System.out.println(name + "  Account has been closed.");
	}

	public void depositAmount(int x) {
		System.out.println(x + "  Ammount has been deposited.");
	}

	public void withdrawnAmmount(int x) {
		System.out.println(x + "  Ammount has been with drawn.");
	}

	public void checkAccess(String name) {
		System.out.println(name + "  check has been accesed by cashier.");
	}

	public void lockerAceess() {
		System.out.println("locker has been accesed by Manager.");
	}

	public void service() {
		System.out.println("services can be done by clerck  ");
	}
}
