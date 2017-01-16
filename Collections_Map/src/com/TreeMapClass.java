package com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<>();
		hm.put(1, "vivek");
		hm.put(20, "kittu");
		hm.put(13, "vicky");
		hm.put(4, "mahesh");//no nulls in keys and have sorted oreder of keys.
		
		
		System.out.println(hm);
		System.out.println("\n------------");
		
		Set keys =hm.entrySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
