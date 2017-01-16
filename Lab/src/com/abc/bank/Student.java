package com.abc.bank;

public class Student {
	int rollNo=1256;
	String studentName="boy";
	int totalMarks=300;
	int marksInEng=95;
	int marksInMat=83;
	int marksInSci=50;
	int total=marksInEng+marksInMat+marksInSci;
	double  percentage=(total*100)/totalMarks;
		
	
	
	void display(){
		System.out.println("total marks is "+total);
		System.out.println("Percentage is "+percentage);
		System.out.println("total marks is "+rollNo);
	}
	
	

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		

	}

}
