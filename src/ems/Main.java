package ems;

import model.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load or new data
		SerializableStorage ss = new SerializableStorage();
		Hashtable<String, Calendar> calendarMgr = ss.read();

		// create panel

		MainFrame frame = new MainFrame(calendarMgr);

		// load exist data
	}

}
