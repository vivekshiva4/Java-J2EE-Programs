package com;

public class Test {

	public static void main(String[] args) {
		SingleThread s= new SingleThread();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.start();
	t2.start();
	}

}
