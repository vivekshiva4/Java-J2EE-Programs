
public class Tset {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentId(10147);
		s1.setName("vivek");
		s1.setBranch("Ece");
		s1.setCollege("cvr college");
		
		Student s2=new Student();
		s2.setStudentId(1018);
		s2.setName("kittu");
		s2.setBranch("Cse");
		s2.setCollege("cvr college of engineering");
		
		s1.display();
		s2.display();
	}

}
