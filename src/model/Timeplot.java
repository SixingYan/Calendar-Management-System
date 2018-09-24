package model;

import java.util.Enumeration;
import java.util.Hashtable;

public class Timeplot {
	
	public Hashtable<Integer, Meeting> meetingMgr = new Hashtable<>();
	int maxNumber;
	int date;
	int duration;
	int early; //1500
	int late; //1000
	Boolean status = true;
	//String detail;
	//String[][] availStartMM = {{"00","15","30","45"},{"00","20","40"},{"00","30"}};
	
	public Timeplot(int date, int duration, int early, int late){
		this.date = date;
		this.duration = duration;
		this.early = early;
		this.late = late;
		//this.detail = detail + getDetail();
	}
	public String getString() {
		return String.valueOf(this.date) + ": " + String.valueOf(this.early) + " " + String.valueOf(this.late);
	}
	public String getTimeRangeStr() {
		return this.early + "-" + this.late; 
	}
	
	public Boolean wasFull() {
		if (meetingMgr.size() == maxNumber)
			return true;
		return false;
	}

	public Boolean addMeeting(int startTimeDigit, String[] people, String location) {
		if (meetingMgr.contains(startTimeDigit)) {
			return false;
		}
		else {
			Enumeration<Integer> digits = meetingMgr.keys();
			while (digits.hasMoreElements()){
				int t = digits.nextElement();
				if (t > startTimeDigit & (t - this.duration) < startTimeDigit){
					return false;
				}
				if (t < startTimeDigit & (t + this.duration) > startTimeDigit) {
					return false;
				}
			}
		}
		
		Meeting m = new Meeting();
		this.meetingMgr.put(startTimeDigit, m);
		return true;
	}

	public Boolean removeMeeting(int startTimeDigit) {
		if (!meetingMgr.contains(startTimeDigit)) {
			return false;
		}
		meetingMgr.remove(meetingMgr.get(startTimeDigit));
		return true;
	}
}
