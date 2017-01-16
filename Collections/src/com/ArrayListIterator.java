package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("vivek");
		ar.add(1, "kittu");
		ar.add("vicky");
		System.out.println(ar);
		
		for(int i=0;i<ar.size();i++){
			System.out.print(ar.get(i)+" ");//old method to remove brackets
			
		}
		System.out.println("\n-----------");
		
		for(String s:ar){
			System.out.print(s+" ");//another method
		}
		System.out.println("\n-----------");
		
		Iterator<String> it=ar.iterator();
		
		while (it.hasNext())
		{
			System.out.print(it.next()+" ");//most approchable method
											// iterator is used to iterate the objects.
		}
	}

}
