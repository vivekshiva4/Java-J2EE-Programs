package com;

public class Test {

	public static void main(String[] args) {

		TwoWheeler t = new TwoWheeler();
		t.registerVechile();
		t.display();

		ThreeWheeler t1 = new ThreeWheeler();
		t1.registerVechile();
		t1.display();

		FourWheeler f = new FourWheeler();
		f.registerVechile();
		f.display();

	}
}