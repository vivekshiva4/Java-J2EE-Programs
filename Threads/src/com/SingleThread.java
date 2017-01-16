package com;

public class SingleThread extends Thread {

	@Override
	public void run() {
		fun();
		fun1();

	}

	public void fun() {
		String tname = Thread.currentThread().getName();
		System.out.println("values of i is:" + tname);
		for (int i = 0; i <= 10; i++)
			System.out.println(i + "--" + tname);
	}

	public void fun1() {
		String tname = Thread.currentThread().getName();
		System.out.println("values of j is:" + tname);
		for (int j = 0; j <= 10; j++) {
			System.out.println(j + "--" + tname);
		}
	}
}
