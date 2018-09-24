package model;

import java.util.ArrayList;
import java.util.Date;

public class Meeting{
	public ArrayList<String> people;
	Boolean status;
	String location;
	int start;
	int duration;

	public String getString () {
		return String.valueOf(this.start) + " " + String.valueOf(this.duration) + "min " + getStatusStr(); 
	}

	public String getStatusStr () {
		if (status) return "activated";
		return "closed";
	}

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
