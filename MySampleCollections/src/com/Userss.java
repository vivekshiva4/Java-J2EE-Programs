package com;

import java.util.ArrayList;

public class Userss {
	public static void main(String[] args) {
		ArrayList<User> ur=new ArrayList<User>();
		
		User u1=new User("vivek", "vivekshiva.4", "10-jan-1994", "shiva", "vivek");
		User u2=new User("uday", "uday@tippy123", "25-jan-1994", "uday", "tippy");
		User u3=new User("nanda", "nanda#$miryala,,.4", "20-jan-1994", "nanda", "miryala");
		User u4=new User("arun", "kareearunAQ@", "26-dec-1994", "arun", "nimalla");
		User u5=new User("mahesh", "mahikethavath125846yr45$%", "29-mar-1992", "mahesh", "kethavathv");
		User u6=new User("harsha", "harsharebel125^&^%", "16-july-1995", "Harsha", "Rebel");
		User u7=new User("kittu", "vivekshiva.4", "10-jan-1994", "shiva", "vivek");
	
		
		ur.add(u1);
		ur.add(u2);
		ur.add(u3);
		ur.add(u4);
		ur.add(u5);
		ur.add(u6);
		ur.add(u7);
		
		for(User u:ur){
			u.display();
		}
		
	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


