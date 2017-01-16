package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSetClass {

	public static void main(String[] args) {
		LinkedHashSet ar=new LinkedHashSet<>();
		ar.add("vivek");
		ar.add(2586);
		ar.add('c');
		ar.add(520.6f);
		ar.add("vivek");//no duplicates will allow 
						//no indexes,no get method, 
						//here order gaurnteed
						
		System.out.println(ar);
		ar.size();
		ar.remove(2586);
		System.out.println(ar);
	}

}
