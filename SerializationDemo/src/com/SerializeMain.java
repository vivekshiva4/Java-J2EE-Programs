package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(101);
		product.setName("Keyboard");

		try {
			FileOutputStream fos = new FileOutputStream("E:\\Serialize.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(product);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-- Failed to write serialized object");
		}
		System.out.println("-- Writing done");
	}
}
