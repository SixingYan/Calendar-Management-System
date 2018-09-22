package model;

public class Person {
	int ID;
	String name;
	
	public Person (String name) {
		this.name = name;
		this.ID = name.hashCode();
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
}
