package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializeMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Serialize.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Product product = null;
			product = (Product) ois.readObject();
			System.out.println("Product name is :" + product.getName());
			System.out.println("Product ID is :" + product.getId());
			System.out.println("-------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-- Failed to Deserialize");
		}

		System.out.println("-- Deserialization done");
	}
}
