package com;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x :");
		int x=sc.nextInt();
		System.out.println("entered value of x is :"+x);
		
		
				;
		int y;
		for(y=1;y<=10;y++){
			int z=x*y;
			System.out.println(x +"x"+ y +"=" +z);
		}
		
	}

}
