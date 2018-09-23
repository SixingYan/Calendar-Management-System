package model;

import java.util.ArrayList;
import java.util.Date;

public class Meeting{
	ArrayList<String> people;
	Boolean status;
	String location;
	int startTimeDigit;
	
	public Meeting (String location) {
		this.location = location;
	}

	public Meeting (ArrayList<String> people) {
		this.people = people;
		this.location = "Fuller Lab";
	}
	
	public Meeting (ArrayList<String> people, String location) {
		this.people = people;
		this.location = location;
	}

	public void open() {
		this.status = true;
	}

	public void close() {
		this.status = false;
	}
	
	public Boolean getStatus() {
		return status;
	}

	
}
