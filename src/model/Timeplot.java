package model;

import java.util.Hashtable;

public class Timeplot {
	
	Hashtable<Integer, Meeting> meetingMgr = new Hashtable<>();
	int maxNumber;
	int dateDigit;
	int duration;
	int earlyTimeDigit; //1500
	int lateTimeDigit; //1000
	Boolean status = true;
	String detail;
	String[][] availStartMM = {{"00","15","30","45"},{"00","20","40"},{"00","30"}};
	
	public Timeplot(int dateDigit, int duration, int earlyTimeDigit, int lateTimeDigit, String detail){
		this.dateDigit = dateDigit;
		this.duration = duration;
		this.earlyTimeDigit = earlyTimeDigit;
		this.lateTimeDigit = lateTimeDigit;
		this.detail = detail + getDetail();
	}
	public int[] getAvailStartTime() {
		String[] mins;
		int eHour = this.;
		int lHour = this.;
		if (this.duration == 15) {
			mins = this.availStartMM[0];
		}
		else if (this.duration == 20) {
			
		}
		else {
			
		}
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
			Enumeration digits = meetingMgr.keys();
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
		
		Meeting m = new 
		meetingMgr.put(startTimeDigit, m);
		return true;
	}

	public Boolean removeMeeting(int startTimeDigit) {
		if (!meetingMgr.contains(startTimeDigit)) {
			return false;
		}
		meetingMgr.remove(meetingMgr.get(startTimeDigit));
		return true;
	}
	
	public String getDetail() {
		return " " + String.valueOf(this.dateDigit) + " ";
	}
}
