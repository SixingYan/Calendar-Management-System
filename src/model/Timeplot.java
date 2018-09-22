package model;

public class Timeplot {
	MeetingManager mManager;
	int dateDigit;
	int duration;
	int earliestTimeDigit;
	int latestTimeDigit;

	public Timeplot(dateDigit, duration, earliestTimeDigit, latestTimeDigit){
		this.dateDigit = dateDigit;
		this.duration = duration;
		this.earliestTimeDigit = earliestTimeDigit;
		this.latestTimeDigit = latestTimeDigit;
		this.mManager = new MeetingManager();
	}

	public Boolean addMeeting(int startTimeDigit, Meeting mt) {
		if (mManager.contains(startTimeDigit)) {
			return false;
		}
		else {
			Enumeration digits = mManager.keys();
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
		
		mManager.put(startTimeDigit, Meeting);
		return true;
	}

	public Boolean removeMeeting(int startTimeDigit) {
		if (!mManager.contains(startTimeDigit)) {
			return false;
		}
		mManager.remove(mManager.get(startTimeDigit));
		return true;
	}

}
