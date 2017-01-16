package comn;

import java.util.ArrayList;

public class Employee {
	
	private int empId;
	private String empName;
	private String empCompany;
	private double salary;
	private ArrayList<Address> addrs=new ArrayList<>();
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(ArrayList<Address> addrs) {
		this.addrs = addrs;
	}

	public Employee(int empId, String empName, String empCompany, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
		this.salary = salary;
	}
	
	public void display(){
		System.out.println("Employee id is :"+empId);
		System.out.println("Employee name is :"+empName);
		System.out.println("Employee company is :"+empCompany);
		System.out.println("Employee salary is :"+salary);
		
		for(Address addr:addrs){
			System.out.println("address type is:  "+addr.getAddrType());
			System.out.println("address  is:  "+addr.getAddress());
			
		}
		System.out.println("----------------------------------");
	}

}
