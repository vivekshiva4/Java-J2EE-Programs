package com;

import java.util.Collections;
import java.util.HashMap;

public class Problem {

	public static void main(String[] args) {
		HashMap<Integer, String> hr = new HashMap<Integer, String>();
		hr.put(21, "vivek");
		hr.put(5, "uday");
		hr.put(12, "vivek");
		hr.put(31, "uday");
		Integer maxAgeis = Collections.max(hr.keySet());

		System.out.println("The max age is :" + maxAgeis);
		System.out.println("maximum age person is  : "+hr.get(maxAgeis));

		
		
	}

}
