package controller;

import javax.swing.ListModel;

import model.Calendar;
import model.Meeting;
import model.Timeplot;
import view.AddCalendarDialog;
import view.AddMeetingDialog;
import view.AddTimeplotDialog;
import view.MainFrame;

public class AddController {
	MainFrame frame;

	public AddController (MainFrame frame) {
		this.frame = frame;
	}

	public void add () {
		/**
		 * calendars all
		 * timeplots personal 
		 * meetings  20180924
		 * meeting   1315
		 */
		String object = this.frame.getString(frame.objectField);
		String value = this.frame.getString(frame.valueField);

		if (object.equals("calendars") & value.equals("all"))
			addCalendar();
		else if (object.equals("timeplots"))
			addTimeplot(value);
		else if (object.equals("meetings"))
			addMeeting(value);
		else if (object.equals("meeting"))
			addPerson(value);
		else ;
	}

	public void addCalendar() {
		// 要放入一些初始化参数
		AddCalendarDialog acd = new AddCalendarDialog();
		acd.getDurationComboBox().addItem(10);
		acd.getDurationComboBox().addItem(15);
		acd.getDurationComboBox().addItem(20);
		acd.getDurationComboBox().addItem(30);
		acd.getDurationComboBox().addItem(60);

		acd.getOkButton().setEnabled(false);
		acd.setVisible(true);

		if (acd.wasUpdated()) {

			String name = acd.getNameField().getText();
			int duration = (int) acd.getDurationComboBox().getSelectedItem();
			String startYear = acd.getStartYearField().getText();
			String startMonth = acd.getStartMonthField().getText();
			String startDay = acd.getStartDayField().getText();
			String startDoW = acd.getStartDoWField().getText();
			String endYear = acd.getEndYearField().getText();
			String endMonth = acd.getEndMonthField().getText();
			String endDay = acd.getEndDayField().getText();
			String endDow = acd.getEndDoWField().getText();
			String earlyText = acd.getEarlyField().getText();
			String lateText = acd.getLateField().getText();

			int start = Integer.valueOf(startYear+startMonth+startDay).intValue();
			int end = Integer.valueOf(endYear+endMonth+endDay).intValue();
			int early = Integer.valueOf(earlyText).intValue();
			int late = Integer.valueOf(lateText).intValue();

			// update mgr
			Calendar c = new Calendar(name, start, end, duration, early, late);
			this.frame.curCalendarMgr.put(name, c);

			// update
			this.frame.textList.add(c.getString());
		}

		acd.dispose();

		frame.repaint();

	} 

	public void addTimeplot(String calendarName) {
		AddTimeplotDialog atd = new AddTimeplotDialog();

		if (atd.wasUpdated()) {
			String year = atd.getYearField().getText();
			String month = atd.getMonthField().getText();
			String day = atd.getDayField().getText();
			String curCalName = this.frame.curCalendar;

			// update the calendar mgr
			Calendar c = this.frame.curCalendarMgr.get(curCalName);
			Timeplot t = c.addDay(Integer.valueOf(year+month+day).intValue());
			this.frame.curCalendarMgr.put(curCalName, c);

			// update the JList
			this.frame.textList.add(t.getString());
		}
		atd.dispose();

		frame.repaint();
	}

	public void addMeeting(String calendarName, String dateDigit) {

		AddMeetingDialog amd = new AddMeetingDialog();

		if (amd.wasUpdated()) {
			String time = amd.getTimeField().getText();
			String location = amd.getLocationField().getText();
			
			ListModel<String> peopleList = amd.getPersonList().getModel();
			String[] people = new String[peopleList.getSize()];
			for (int i=0;i< peopleList.getSize();i++)
				people[i] = peopleList.getElementAt(i);
			
			Meeting m = new Meeting(Integer.valueOf(time).intValue(), location, people);
			//Calendar c = this.frame.curCalendarMgr.get(calendarName);
			
			// update the calendar mgr
			Calendar c = this.frame.curCalendarMgr.get(this.frame.curCalendar)
			Timeplot t = c.timeplotMgr.get(this.frame.curTimeplot);
			t.meetingMgr.put(time, m);
			c.timeplotMgr.put(this.frame.curTimeplot, t);
			this.frame.curCalendarMgr.put(this.frame.curCalendar, c);

			// update the JList
			this.frame.textList.add(m.getString());
		}
		amd.dispose();

		// update JList

		frame.repaint();

	}

	public void addPerson(AddMeetingDialog amd) {
		// update the JList
		if (amd.nameWasUpdated()){
			String name = amd.getNameField().getText();
			amd.getPersonList().add(name);
			amd.getNameField().setText(null);
		}
		frame.repaint();
	}



















}
