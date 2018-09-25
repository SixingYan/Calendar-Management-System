package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Timeplot implements Serializable{
	
	public Hashtable<String, Meeting> meetingMgr;
	int maxNumber;
	String date;
	String duration;
	String early; //HH 15 !!!
	String late; //HH 10  !!!
	Boolean status = true;
	ArrayList<String> emptyTime = new ArrayList<>();
	String[][] availStartMM = {{"00","10","20","30","40","50"},
				{"00","15","30","45"},{"00","20","40"},{"00","30"},{"00"}};
	
	public Timeplot(String date, String duration, String early, String late){
		this.date = date;
		this.duration = duration;
		this.early = early;
		this.late = late;
		//prepareEmptyTime();
		this.meetingMgr = new Hashtable<>();
	}
	
	public int toInt(String number) {
		return Integer.valueOf(number).intValue();
	}
	
	public void prepareEmptyTime () {
		int index;
		if (this.duration.equals("10")) index = 0;
		else if (this.duration.equals("15")) index = 1;
		else if (this.duration.equals("20")) index = 2;
		else if (this.duration.equals("30")) index = 3;
		else index = 4;

		for (int i=toInt(this.early); i<= toInt(this.late);i++) {
			for (String mm : this.availStartMM[index])
				this.emptyTime.add(String.valueOf(i)+mm);
		}
	}

	public void removeEmptyTime(String time) {
		this.emptyTime.remove(time);
	}

	public ArrayList<String> getEmptyTime() {
		return this.emptyTime;
	}

	public int getNumber() {
		return meetingMgr.size();
	}

	public String getString() {
		return String.valueOf(this.date) + ": " + String.valueOf(this.early) + " " + String.valueOf(this.late);
	}

	public String getTimeRangeStr() {
		return this.early + "-" + this.late; 
	}
	public Boolean getStatus() {
		return this.status;
	}
	public Boolean wasFull() {
		if (meetingMgr.size() == maxNumber)
			return true;
		return false;
	}
}
