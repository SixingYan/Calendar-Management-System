package controller;

import java.util.Iterator;

import model.Calendar;
import model.Meeting;
import model.Timeplot;
import view.MainFrame;
import view.SelectDateDialog;
import view.SelectNameDialog;
import view.SelectTimeDialog;

public class LoadController {
	MainFrame frame;

	public LoadController (MainFrame frame) {
		this.frame = frame;
	}

	public void load () {
		String object = this.frame.getString(frame.objectField);
		String value = this.frame.getString(frame.valueField);

		if (object.equals("Calendars") & value.equals("All"))
			loadCalendar();
		else if (object.equals("Timeplots"))
			loadTimeplot();
		else if (object.equals("Meetings"))
			loadMeeting();
		else ;

	}

	public void loadCalendar () {
		SelectNameDialog sbd = new SelectNameDialog();
		sbd.setModal(true);
		sbd.setVisible(true);
		
		if (sbd.wasUpdated()) {
			String name = sbd.getNameField().getText();

			Calendar c = this.frame.curCalendarMgr.get(name);
			this.frame.valueField.setText(c.name + " " + c.getRangeDateStr()); 

			this.frame.curCalendar = name;
			this.frame.objectField.setText("Timeplots");
			this.frame.valueField.setText(name); 

			this.frame.textModel.clear();
			for(Iterator<String> itr = c.timeplotMgr.keySet().iterator(); itr.hasNext();)
				this.frame.textModel.addElement(c.timeplotMgr.get(itr.next()).getString());
		}
		sbd.dispose();
		frame.repaint();
	}

	public void loadTimeplot ()  {
		SelectDateDialog sdd = new SelectDateDialog();
		sdd.setModal(true);
		sdd.setVisible(true);
		if (sdd.wasUpdated()) {
			String year = sdd.getYearField().getText();
			String month = sdd.getMonthField().getText();
			String day = sdd.getDayField().getText();

			String date = year+month+day;
			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar);
			Timeplot t = c.timeplotMgr.get(date); 
			
			this.frame.curTimeplot = date;
			this.frame.objectField.setText("Meetings");
			this.frame.valueField.setText(year+month+day); 
			this.frame.textModel.clear();
			if (!t.meetingMgr.isEmpty())
				for(Iterator<String> itr = t.meetingMgr.keySet().iterator(); itr.hasNext();)
					this.frame.textModel.addElement(t.meetingMgr.get(itr.next()).getString());
		}
		sdd.dispose();
		frame.repaint();
	}

	public void loadMeeting () {
		SelectTimeDialog std = new SelectTimeDialog();
		std.setModal(true);
		std.setVisible(true);
		System.out.print("out1");
		if (std.wasUpdated()) {
			String time = std.getTimeField().getText();
			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar);
			Timeplot t = c.timeplotMgr.get(this.frame.curTimeplot);
			System.out.print("out2");
			Meeting m = t.meetingMgr.get(time);
			System.out.print("out3");
			this.frame.curMeeting = time;
			this.frame.objectField.setText("Meeting");
			this.frame.valueField.setText(time);
			System.out.print("out4");
			this.frame.textModel.clear();
			for(int i=0; i < m.people.size(); i++)
				this.frame.textModel.addElement(m.people.get(i));
		}
		std.dispose();
		frame.repaint();
	}

}
