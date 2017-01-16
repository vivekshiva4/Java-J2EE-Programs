package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm=new Hashtable();
		hm.put(1, "vivek");
		hm.put(2, "kittu");
		hm.put(3, "vicky");
		hm.put(4, "mahesh");//no nulls in keys and values
		
		
		System.out.println(hm);
		System.out.println("\n------------");
		
		Set keys =hm.entrySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
