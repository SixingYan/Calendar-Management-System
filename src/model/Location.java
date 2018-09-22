package model;

public class Location {
	int ID;
	String building;
	String floor;
	String room;

	public Location(String building, String floor, String room){
		this.building=building;
		this.floor=floor;
		this.room=room;
		this.ID = (building+floor+room).hashCode();
	}

	public int getID() {
		return ID;
	}

	public String getBuilding() {
		return building;
	}

	public String getFloor() {
		return floor;
	}

	public String getRoom() {
		return room;
	}

}
