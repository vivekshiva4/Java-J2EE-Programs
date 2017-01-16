package com;

public class Test {

	public static void main(String[] args) {
		String s="vivek";
		System.out.println(s.hashCode());
		System.out.println("string name is :  "+s);
		
		StringBuffer a =new StringBuffer("Hi ");
		System.out.println(a.hashCode());//getting hashcode
		a.append("vivek");
		System.out.println(a.hashCode());
		a.insert(3, "kittu ");
		System.out.println(a.hashCode());
		
		System.out.println(a);
		System.out.println("capacity of string is: "+a.capacity());//to find capacity of string
		System.out.println("string length is :  "+a.length());//length of the string
		

	}

}
