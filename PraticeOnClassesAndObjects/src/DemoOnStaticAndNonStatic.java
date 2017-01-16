
public class DemoOnStaticAndNonStatic {

	int x;  // Non-Static Variable or Instance Variable
	
	static int y;//Static Variabl
	
	
	//Non-Static method
	void display() {
		System.out.println("Non Static method called");
		System.out.println("value of x is  :  " + x);
	}
	
	//Static Method
	static void display1() {
		System.out.println("Static method called");
		System.out.println("value of y is  :  " + y);
	}

	public static void main(String[] args) {
		
		//here object is created because non static variables cannot be decleared in static methods..
		//by creating obj values can be decleared..
		DemoOnStaticAndNonStatic d1=new DemoOnStaticAndNonStatic();
		d1.x=100;
		y=200;
		d1.display();
		display1();
	}

}
