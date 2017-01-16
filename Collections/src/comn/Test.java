package comn;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> ar = new ArrayList<>();
		Employee e1 = new Employee(1255, "vivek", "bimirian", 25062.3);
		Employee e2 = new Employee(1256, "kittu", "bimirian", 25502.3);
		Employee e3 = new Employee(1257, "vicky", "bimirian", 25690.3);
		
		Address temp=new Address();
		Address per=new Address();
		
		temp.setAddrType("temperory");
		temp.setAddress("hyderabad");
		
		per.setAddrType("permenannt");
		per.setAddress("achampet");
		
		e1.getAddrs().add(per);
		e1.getAddrs().add(temp);

		ar.add(e1);
		ar.add(e2);
		ar.add(e3);

		System.out.println(ar.size());

		for (Employee e : ar) {

			e.display();

		}

	}

}
