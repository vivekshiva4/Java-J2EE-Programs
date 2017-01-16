package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "vivek");
		hm.put(2, "kittu");
		hm.put(3, "vicky");
		hm.put(null, "mahesh");
		
		
		System.out.println(hm);
		System.out.println("\n------------");
		//key set is used....
		
	Set keys=hm.entrySet();
	Iterator<Integer> it=keys.iterator();
	while(it.hasNext()){
		System.out.print((it.next())+"  ");
	}
		
	}

}
