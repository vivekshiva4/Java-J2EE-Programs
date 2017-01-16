package com;

public final class VivekFinal {

	final int x = 100;

	void display() {
		System.out.println("value of x is   " + x);
	}

	public final void test(int y) {

		y = 200;
		System.out.println("final method   " + y);
	}

}
//final can write to methods classes 
//method marked as final cannot be changed
//final doesnt inhert classes
//final methods cannot be overrided