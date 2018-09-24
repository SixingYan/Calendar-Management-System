package model;

import java.util.Hashtable;

public class Calendar {
	int start; // YYYYMMDD
	int end; // YYYYMMDD
	int duration;
	int early; //HHMM
	int late; //HHMM
	public Hashtable <Integer,Timeplot> timeplotMgr = new Hashtable<>();
	String name;
	String detail;

	public Calendar (String name, int start, int end, 
					int duration, int early, int late) {
		this.start = start; // YYYYMMDD
		this.end = end;
		this.duration = duration;
		this.early = early;
		this.late = late;
		this.name = name;
		this.detail = getDetail();
		for (int d=start; d < end+1; d++) 
			this.timeplotMgr.put(d, new Timeplot(d, duration, early, late, this.detail));
	}

	public String getRangeDateStr() {
		return String.valueOf(this.start) + "-" + String.valueOf(this.end);
	}

	public Timeplot addDay(int dateDigit) {
		Timeplot t = new Timeplot(dateDigit, this.duration, this.early, this.late);
		this.timeplotMgr.put(dateDigit, t);
		return t;
	}

	public void removeDay(int dateDigit) {
		if (this.timeplotMgr.contains(dateDigit)) {
			timeplotMgr.remove(dateDigit);
		}
	}
	
	public String getString() {
		return //this.name + " " + getRangeDateStr();
	}
	
	public int getDuration() {
		return duration;
	}

	public String getName() {
		return name;
	}

	public int getstart() {
		return start;
	}

	public int getend() {
		return end;
	}
	
}
