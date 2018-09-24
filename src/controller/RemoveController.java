package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Calendar;
import model.Meeting;
import model.Timeplot;
import view.MainFrame;
import view.SelectDateDialog;
import view.SelectNameDialog;
import view.SelectTimeDialog;

public class RemoveController {
	MainFrame frame;

	public RemoveController (MainFrame frame) {
		this.frame = frame;
	}

	public void remove () {
		String object = this.frame.getString(frame.objectField);
		String value = this.frame.getString(frame.valueField);

		if (object.equals("calendars") & value.equals("all"))
			removeCalendar();
		else if (object.equals("timeplots"))
			removeTimeplot();
		else if (object.equals("meetings"))
			removeMeeting();
		else ;
	}

	public void removeCalendar () {
		SelectNameDialog sbd = new SelectNameDialog();
		if (sbd.wasUpdated()) {
			String name = sbd.getNameField().getText();
			this.frame.curCalendarMgr.remove(name);

			ArrayList<String> arr = new ArrayList<>();
			for(Iterator<String> itr = this.frame.curCalendarMgr.keySet().iterator(); itr.hasNext();)
				arr.add(this.frame.curCalendarMgr.get(itr.next()).getString());
			this.frame.textList.setListData((String[]) arr.toArray());
		}
		sbd.dispose();

		frame.repaint();
	}

	public void removeTimeplot () {
		SelectDateDialog sdd = new SelectDateDialog();
		if (sdd.wasUpdated()) {
			String year = sdd.getYearField().getText();
			String month = sdd.getMonthField().getText();
			String day = sdd.getDayField().getText();

			int date = Integer.valueOf(year+month+day).intValue();
			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar);
			c.timeplotMgr.remove(date);
			this.frame.curCalendarMgr.put(this.frame.curCalendar, c);

			ArrayList<String> arr = new ArrayList<>();
			for(Iterator<Integer> itr = c.timeplotMgr.keySet().iterator(); itr.hasNext();)
				arr.add(c.timeplotMgr.get(itr.next()).getString());
			this.frame.textList.setListData((String[]) arr.toArray());
		}
		sdd.dispose();

		frame.repaint();
	}

	public void removeMeeting () {
		SelectTimeDialog std = new SelectTimeDialog();
		if (std.wasUpdated()) {
			String timeStr = std.getTimeField().getText();
			int time = Integer.valueOf(timeStr).intValue();

			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar); 
			Timeplot t = c.timeplotMgr.get(this.frame.curTimeplot);
			t.meetingMgr.remove(time);

			c.timeplotMgr.put(this.frame.curTimeplot,t);
			this.frame.curCalendarMgr.put(this.frame.curCalendar, c);

			ArrayList<String> arr = new ArrayList<>();
			for(Iterator<Integer> itr = t.meetingMgr.keySet().iterator(); itr.hasNext();)
				arr.add(t.meetingMgr.get(itr.next()).getString());
			this.frame.textList.setListData((String[]) arr.toArray());

		}
		std.dispose();

		frame.repaint();
	}

	public void removePerson () {
		SelectNameDialog sbd = new SelectNameDialog();
		if (sbd.wasUpdated()) {
			String name = sbd.getNameField().getText();
			
			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar); 
			Timeplot t = c.timeplotMgr.get(this.frame.curTimeplot);
			Meeting m = t.meetingMgr.get(this.frame.curMeeting);

			m.people.remove(name);

			t.meetingMgr.put(this.frame.curMeeting, m);
			c.timeplotMgr.put(this.frame.curTimeplot, t);
			this.frame.curCalendarMgr.put(this.frame.curCalendar, c);

			this.frame.textList.setListData((String[]) m.people.toArray());
		}
		sbd.dispose();

		frame.repaint();
	}
}
