package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Meeting implements Serializable{
	public ArrayList<String> people = new ArrayList<>();
	Boolean status;
	String location;
	String start;
	String duration;
	
	public Meeting (String duration, String start, String location, ArrayList<String> people) {
		this.duration = duration;
		this.start = start;
		this.location = location;
		this.people = people;
	}
	
	public String getString () {
		return String.valueOf(this.start) + " " + String.valueOf(this.duration) + "min " + location + " " + people.toString(); 
	}

	public String getStatusStr () {
		if (status) return "activated";
		return "closed";
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
