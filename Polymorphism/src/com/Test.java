package com;

public class Test {

	public static void main(String[] args) {
		Workers w;
		w = new SalariedWorkers();
		w.pay();
		w.display();
		
		w=new DailyWorkers();
		w.pay();
		w.display();

	}

}
