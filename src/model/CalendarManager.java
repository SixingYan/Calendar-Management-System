package model;

public class CalendarManager {
	Hashtable calendars = new Hashtable();

	public Calendar load(String name) {
		if (name == null) return null;
		if (calendars.contains(name)) return calendars.get(name);
		return null;
	}

	public Boolean create(String name, int[] startDate, int[] endDate, int duration, int earliest, int latest) {
		if (name != null & calendars.contains(name)) return false;
		Calendar calendar = new Calendar(name, startDate, endDate, duration, earliest, latest);
		return true;
	}

	public Boolean delete(String name) {
		if (calendars.contains(name)) {
			calendars.remove(calendars.get(name));
			return true;
		}
		return false;
	}

	public Boolean addDay(String name, int dateDigit) {
		if (name != null & calendars.contains(name)) return false;
		Calendar c = this.calendars.get(name);
		c.addDay();
		this.calendars.put(name, c);
		return true;
	}

	public Boolean removeDay(String name,  int dateDigit) {
		if (name != null & calendars.contains(name)) return false;
		Calendar c = this.calendars.get(name);
		c.removeDay();
		this.calendars.put(name, c);
		return true;
	}

}
