package model;

public class Calendar {
	int startDateDigit; // YYYYMMDD
	int endDateDigit; // YYYYMMDD
	int duration;
	int earliestTimeDigit; //HHMM
	int latestTimeDigit; //HHMM
	TimeplotManager tManager;
	String name;

	public Calendar (String name, int startDateDigit, int endDateDigit, 
					int duration, int earliestTimeDigit, int latestTimeDigit) {
		this.startDateDigit = startDateDigit; // YYYYMMDD
		this.endDateDigit = endDateDigit;
		this.duration = duration;
		this.earliestTimeDigit = earliestTimeDigit;
		this.latestTimeDigit = latestTimeDigit;
		this.name = name;
		this.tManager = new TimeplotManager(startDateDigit, endDateDigit, duration, earliestTimeDigit, latestTimeDigit);
	}

	public int[] getRange() {
		int[] rangeDate = new int[2];
		rangeDate[0] = this.startDateDigit;
		rangeDate[1] = this.endDateDigit;
		return rangeDate;
	}

	public void addDay(int dateDigit) {
		if (!this.tManager.contains(dateDigit)) {
			Timeplot t = new Timeplot(dateDigit, this.duration, this.earliest, this.latest)
			this.tManager.put(dateDigit, t);
		}
		if dateDigit
	}

	public void removeDay(int dateDigit) {
		if (this.tManager.contains(dateDigit)) {
			tManager.remove(tManager.get(name));
		}
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

	public int getEarliestTimeDigit() {
		return earliestTimeDigit;
	}

	public int getLatestTimeDigit() {
		return latestTimeDigit;
	}

}
