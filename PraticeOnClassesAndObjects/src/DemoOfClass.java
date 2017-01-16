
// Defination of a class:
//class is a blue print of a object which let you know to define properties and methods of an object..
public class DemoOfClass {
	// properties of a object.
	int x = 100;
	int y = 20;

	// methods of a object..
	void display() {
		System.out.println("value of x is  :  " + x);
		System.out.println("value of y is  :  " + y);
	}

	public static void main(String[] args) {
		DemoOfClass d = new DemoOfClass();
		d.display();
	}

}
