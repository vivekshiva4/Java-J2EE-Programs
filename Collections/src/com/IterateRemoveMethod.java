package com;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateRemoveMethod {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("vivek");
		ar.add(1, "kittu");
		ar.add("vicky");
		System.out.println(ar);
		
		
		Iterator<String> it=ar.iterator();// iterator has amethod remove while display
		
		while(it.hasNext()){
			String s=it.next();
			
			if(s.equals("vivek"))
			it.remove();
			System.out.print(s+" ");
		}
		
		System.out.println(ar);
	}

}
