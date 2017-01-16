package com;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet ar=new HashSet<>();
		ar.add("vivek");
		ar.add(2586);
		ar.add('c');
		ar.add(520.6f);
		ar.add("vivek");//no duplicates will allow 
						//no indexes,no get method,no order gaurnteed
						
		System.out.println(ar);
		ar.size();
		ar.remove(2586);
		System.out.println(ar);
		
		
		

	}

}
