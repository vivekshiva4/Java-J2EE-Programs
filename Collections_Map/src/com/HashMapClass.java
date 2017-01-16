package com;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "vivek");
		hm.put(2, "kittu");
		hm.put(3, "vicky");
		hm.put(null, "mahesh");
		
		hm.replace(1, "Vivek");
		hm.remove(2);
		
		
		System.out.println(hm);
		System.out.println(hm.get(4));

	}

}
