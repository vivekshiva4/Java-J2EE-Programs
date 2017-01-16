package com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LiknedHashMapClass {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
		hm.put(1, "vivek");
		hm.put(2, "kittu");
		hm.put(null, "vicky");
		hm.put(4, "mahesh");//order gaurnteed even null values
		
		
		System.out.println(hm);
		System.out.println("\n------------");
		
		Set keys =hm.entrySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
