package controller;

import view.MainFrame;

public class LoadController {
	MainFrame frame;

	public LoadController (MainFrame frame) {
		this.frame = frame;
	}

	public void load () {
		String object = this.frame.getString(frame.objectField);
		String value = this.frame.getString(frame.valueField);

		if (object.equals("calendars") & value.equals("all"))
			loadCalendar();
		else if (object.equals("timeplots"))
			loadTimeplot();
		else if (object.equals("meetings"))
			loadMeeting();
		else ;

	}

	public void loadCalendar () {
		SelectNameDialog sbd = new SelectNameDialog();

		if (sbd.wasUpdated()) {
			name = sbd.getNameField().getText();
			// if not found


			c = this.frame.curCalendarMgr.get(name);
			this.frame.valueField.setText(c.name + " " + c.getRangeDateStr()); 

			this.frame.curCalendar = name;
			c.timeplotMgr
			this.frame.textList

		}
		sbd.dispose();

		frame.repaint();
	}

	public void loadTimeplot ()  {
		SelectDateDialog sdd = new SelectDateDialog();
		if (sdd.wasUpdated()) {
			String year = atd.getYearField().getText();
			String month = atd.getMonthField().getText();
			String day = atd.getDayField().getText();

			int date = Integer.valueOf(year+month+day).intValue();
			c = this.frame.curCalendarMgr.get(this.frame.curCalendar).
			t = c.timeplotMgr.get(date); 
			this.frame.valueField.setText(year+month+day); 


			this.frame.curTimeplot = date;
			t.meetingMgr
			this.frame.textList
		}
		sdd.dispose();

		frame.repaint();
	}

	public void loadMeeting () {
		SelectTimeDialog std = new SelectTimeDialog();
		if (std.wasUpdated()) {
			String timeStr = amd.getTimeField().getText();
			String time = Integer.valueOf(timeStr).intValue()

			c = this.frame.curCalendarMgr.get(this.frame.curCalendar);
			t = c.timeplotMgr.get(this.frame.curTimeplot);
			m = t.meetingMgr.get();

			this.frame.curMeeting = time;
			m.people
			this.frame.textList

		}
		std.dispose();

		frame.repaint();
	}

}
