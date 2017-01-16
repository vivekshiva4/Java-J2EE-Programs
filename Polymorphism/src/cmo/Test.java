package cmo;

public class Test {

	public static void main(String[] args) {
		Employee e;
		e=new It();
		e.registration();
		e.display();
		
		
		e=new Hr();
		e.registration();
		e.display();
		
		e=new ItRecruiter();
		e.registration();
		e.display();

	}

}
