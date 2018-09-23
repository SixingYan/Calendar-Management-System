package model;

import java.util.Hashtable;

public class Calendar {
	int startDateDigit; // YYYYMMDD
	int endDateDigit; // YYYYMMDD
	int duration;
	int earlyTimeDigit; //HHMM
	int lateTimeDigit; //HHMM
	Hashtable <Integer,Timeplot> tManager = new Hashtable<>();
	String name;
	String detail;

	public Calendar (String name, int startDateDigit, int endDateDigit, 
					int duration, int earlyTimeDigit, int lateTimeDigit) {
		this.startDateDigit = startDateDigit; // YYYYMMDD
		this.endDateDigit = endDateDigit;
		this.duration = duration;
		this.earlyTimeDigit = earlyTimeDigit;
		this.lateTimeDigit = lateTimeDigit;
		this.name = name;
		this.detail = getDetail();
		for (int d=startDateDigit; d < endDateDigit+1; d++) 
			this.tManager.put(d, new Timeplot(d, duration, earlyTimeDigit, lateTimeDigit, this.detail));
		
		//this.tManager = new TimeplotManager(startDateDigit, endDateDigit, duration, earliestTimeDigit, latestTimeDigit);
	}

	public String getRangeDateStr() {
		return String.valueOf(this.startDateDigit) + "-" + String.valueOf(this.endDateDigit);
	}

	public void addDay(int dateDigit) {
		if (!this.tManager.contains(dateDigit)) {
			Timeplot t = new Timeplot(dateDigit, this.duration, this.earliestTimeDigit, this.latestTimeDigit);
			this.tManager.put(dateDigit, t);
		}
	}

	public void removeDay(int dateDigit) {
		if (this.tManager.contains(dateDigit)) {
			tManager.remove(dateDigit);
		}
	}
	
	public String getDetail() {
		return this.name + " " + getRangeDateStr();
	}
	
	public int getDuration() {
		return duration;
	}

	public String getName() {
		return name;
	}

	public int getStartDateDigit() {
		return startDateDigit;
	}

	public int getEndDateDigit() {
		return endDateDigit;
	}
	
}
