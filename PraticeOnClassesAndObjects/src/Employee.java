//dont use static variables in a class 
//here is the reason...in the below program 
public class Employee {

	int empId;
	static int x = 100;
	/// dont use variables as static because if we cahnge the value of x in e1
	// then value of x in e2 is also changed.
	// the last updated value will be effected.
	// where as in nonstatic varibles it doesnt effected..
	// so use always non static variable.....

	private void display() {
		System.out.println("empId is  :" + empId);
		System.out.println("value of x :" + x);

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.empId = 1024;
		e2.empId = 1025;
		e1.x = 200;
		e2.x = 50;

		e1.display();
		e2.display();
		

	}

}
