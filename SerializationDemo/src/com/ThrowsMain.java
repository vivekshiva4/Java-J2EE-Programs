package com;

public class ThrowsMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		try {
			if (y == 0) {
				throw new ArithmeticException("Y value should not be Zero");
			}
			z = x / y;
			System.out.println("Value of Z: " + z);

		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
