package model;

import java.util.ArrayList;
import java.util.Date;

public class Meeting{ 
	int ID; // 10 digit timestamp
	String name="";
	ArrayList<Person> people;
	Boolean status;
	Location location;
	
	public Meeting (ArrayList<Person> people) {
		this.ID = generateID();
		this.people = people;
		this.location = new Location("Fuller","one","199");
	}
	
	public Meeting (ArrayList<Person> people, Location location) {
		this.ID = generateID();
		this.people = people;
		this.location = location;
	}
	
	private int generateID() {
		long timestamp = new Date().getTime();
		return Integer.valueOf(String.valueOf(timestamp/1000));
	}

	public void open() {
		this.status = true;
	}

	public void close() {
		this.status = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Person> getPeople() {
		return people;}
	
	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public int getID() {
		return ID;
	}
	
	public Boolean getStatus() {
		return status;
	}

	
}
