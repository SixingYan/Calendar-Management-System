package ems;

import java.io.IOException;
import java.util.Hashtable;

import model.Calendar;
import storage.SerializableStorage;
import view.MainFrame;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Hashtable<String, Calendar> calendarMgr;
		// load or new data
		SerializableStorage ss = new SerializableStorage();
		if (ss.exist())
			calendarMgr = ss.read();
		else
			calendarMgr = new Hashtable<>();
		MainFrame frame = new MainFrame (calendarMgr);

		frame.setVisible(true);

	}

}
