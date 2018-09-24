package controller;

import view.MainFrame;
// delay
public class EditController {
	MainFrame frame;

	public EditController (MainFrame frame) {
		this.frame = frame;
	}

	public void edit () {
		String object = this.frame.getString(frame.objectField);
		String value = this.frame.getString(frame.valueField);

		if (object.equals("calendars") & value.equals("all"))
			editCalendar();
		else if (object.equals("timeplots"))
			editTimeplot();
		else if (object.equals("meetings"))
			editMeeting();
		else ;

	}

	public void editCalendar () {

	}

	public void editTimeplot () {

	}

	public void editMeeting () {
	
	}
}
