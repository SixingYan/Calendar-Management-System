package model;

import java.util.Hashtable;

public class TimeplotManager {
	Hashtable<Integer,Timeplot> timeplots = new Hashtable<>();
	int duration;
	int earliestTimeDigit;
	int latestTimeDigit;

	public TimeplotManager(int startDateDigit, int endDateDigit, int duration, 
							int earliestTimeDigit, int latestTimeDigit) {
		this.duration = duration;
		this.earliestTimeDigit = earliestTimeDigit;
		this.latestTimeDigit = latestTimeDigit;
		for (int d = startDateDigit; d < endDateDigit + 1; d ++) {
			Timeplot t = new Timeplot(d, duration, earliestTimeDigit, latestTimeDigit);
			timeplots.put(d, t);
		}
	}

	public void put(int dateDigit) {
		timeplots.put(dateDigit, new Timeplot(dateDigit, this.duration, this.earliestTimeDigit, this.latestTimeDigit));
	}

	public Timeplot get(int dateDigit) {
		if (timeplots.contains(dateDigit)) {
			return timeplots.get(dateDigit);
		}
		return null;
	}

	public void remove(int dateDigit) {
		if (timeplots.contains(dateDigit)) {
			timeplots.remove(dateDigit);	
		}
		
	}

	public Boolean contains(int dateDigit) {
		return timeplots.contains(dateDigit);
	}


}
