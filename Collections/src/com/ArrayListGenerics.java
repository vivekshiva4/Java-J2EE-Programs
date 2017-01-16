package com;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("vivek");
		ar.add(1, "kittu");
		ar.add("vicky");
		System.out.println(ar);
		//order gaurnted
		//only strings can be used because we used the generics string
		ar.remove("vicky");
		System.out.println(ar);
	}

}
