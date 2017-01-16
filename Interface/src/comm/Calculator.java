package comm;

public class Calculator implements Addition, Substraction, Multiplication, Division {

	public void add(int x, int y) {
		System.out.println("addition of x and y is " + (x + y));
	}

	public void sub(int x, int y) {
		System.out.println("substraction of x and y is " + (x - y));
	}

	public void mul(int x, int y) {
		System.out.println("multiplication of x and y is " + (x * y));
	}

	public void div(int x, int y) {
		System.out.println("division of x and y is " + (x / y));
	}
}
