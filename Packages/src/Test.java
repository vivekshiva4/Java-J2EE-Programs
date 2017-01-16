import mypack.Use;
import mypack.Division;
import mypack.Multiplication;
import mypack.Substraction;

public class Test{
	
	public static void main(String[] args) {
		Use u =new Use();
		u.add(10, 20);
		
		Substraction s =new Substraction();
		s.sub(2, 1);
		
		Multiplication m=new Multiplication();
		m.mul(5, 5);
		Division d=new Division();
		d.div(21, 7);
	}
}
 // in packages we want to import the packages.
