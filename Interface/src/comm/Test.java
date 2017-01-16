package comm;

public class Test {

	public static void main(String[] args) {
		Addition a= new Calculator();
		a.add(10, 20);
		Substraction s= new Calculator();
		s.sub(100, 20);
		Multiplication m=new Calculator();
		m.mul(10, 52);
		Division d= new Calculator();
		d.div(25, 5);

	}

}
