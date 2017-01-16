package com;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> ar=new TreeSet<>();
		
		ar.add("vivek");
		ar.add("kittu");
		ar.add("mahesh");
		ar.add("nanda");
		ar.add("mahesh");
		ar.add("arun");
		System.out.println(ar);
		
		//no dublicates,sorted order,generic type only
		
		ar.remove("kittu");
		System.out.println(ar);
	}

}
