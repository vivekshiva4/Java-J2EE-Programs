package com;

import java.io.Serializable;

public class Product implements Serializable {

	
	private static final long serialVersionUID = 2943207565507904436L;
	
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
