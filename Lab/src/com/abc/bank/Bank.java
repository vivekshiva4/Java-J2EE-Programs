package com.abc.bank;

public class Bank {
	private int dataMembers;
	private String nameOfTheaccount;
	private int accountNumber;
	private int balanceInTheAccount;
	private String typeOfTheAccount;
	
	public void intialValues(){
		System.out.println("type the intial values of the account");
	}
	public void depositAmount(int amt){
		System.out.println("the ammount deposited"+amt);
	}
	public void withDraw(int amt){
		System.out.println("withdrawn amoount is "+amt);
	}
	public void displayBalance(int balanceInTheAccount){
		System.out.println(balanceInTheAccount);
	}
	

}
