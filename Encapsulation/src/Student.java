



//encapsulataion:combining all methods and properties with in a class is called encapsulataion;
//a class is fully encapsulated if and only if all properties are private and all methods are public.
public class Student {

	private int studentId;
	private String name;
	private String branch;
	private String college;
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	
	public void display(){
		System.out.println("studend id is  :"+studentId);
		System.out.println("studend name is  :"+name);
		System.out.println("studend branch is  :"+branch);
		System.out.println("studend college is  :"+college);
		System.out.println("--------------------------------");
	}
	

}
