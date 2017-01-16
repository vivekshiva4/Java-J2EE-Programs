package com;

public final class Use {
	private final String name;

	private Use(String name) 					// private constructor
	{
		this.name = name;
	}

	public String getName() {				//only get method no set methods
		return name;
	}

	public static Use getInstance(String name)		// instance method
	{
		return new Use(name);

	}

}
