package model;

import java.util.Hashtable;
import java.util.Iterator;

public class CalendarManager {
	Hashtable<String,Calendar> calendars = new Hashtable<>();
	
	public Calendar[] getAllCalendar() {
		Calendar[] cList = new Calendar[this.calendars.size()];
		int idx = 0;
		for(Iterator<String> iterator=this.calendars.keySet().iterator(); iterator.hasNext(); idx++)
			cList[idx] = this.calendars.get(iterator.next());
		return cList;
	}
	
	public String[] getAllCalendarString () {
		String[] infoList = new String[this.calendars.size()];
		int idx = 0;
		for(Iterator<String> iterator=this.calendars.keySet().iterator(); iterator.hasNext(); idx ++){
			Calendar c = this.calendars.get(iterator.next());
			infoList[idx] = c.name + " " + c.getRangeDateStr();
		}
		return infoList;
	}
	
	public Calendar load(String name) {
		if (name == null) return null;
		if (calendars.contains(name)) return calendars.get(name);
		return null;
	}

	public Boolean create(String name, int startDateDigit, int endDateDigit, int duration, int earliest, int latest) {
		if (name != null & calendars.contains(name)) return false;
		Calendar calendar = new Calendar(name, startDateDigit, endDateDigit, duration, earliest, latest);
		this.calendars.put(name, calendar);
		return true;
	}

	public Boolean delete(String name) {
		if (this.calendars.contains(name)) {
			this.calendars.remove(name);
			return true;
		}
		return false;
	}

	public Boolean addDay(String name, int dateDigit) {
		if (name != null & calendars.contains(name)) return false;
		Calendar c = this.calendars.get(name);
		c.addDay(dateDigit);
		this.calendars.put(name, c);
		return true;
	}

	public Boolean removeDay(String name,  int dateDigit) {
		if (name != null & calendars.contains(name)) return false;
		Calendar c = this.calendars.get(name);
		c.removeDay(dateDigit);
		this.calendars.put(name, c);
		return true;
	}

}
