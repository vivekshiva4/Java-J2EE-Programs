package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteraorDemo {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("vivek");
		ar.add(1, "kittu");
		ar.add("vicky");
		System.out.println(ar);
		
		ListIterator<String> li=ar.listIterator();
		while(li.hasNext()){
			System.out.print(li.next()+" ");//printing from top to bottom
		}
		System.out.println("\n--------------");
		while(li.hasPrevious()){
			System.out.print(li.previous()+" ");//printing from bottom to top
		}

		System.out.println("\n--------------");
		while(li.hasNext()){
			String s=li.next();
												//remove and add method
			if(s.equals("vivek"))
				li.remove();
				
			System.out.print (s+" ");
		}
		li.add("hi");
		System.out.println(ar);
		
	}

}
