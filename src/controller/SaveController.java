package controller;

import java.io.IOException;

import storage.SerializableStorage;
import view.MainFrame;

public class SaveController {
	MainFrame frame;

	public SaveController (MainFrame frame) {
		this.frame = frame;
	}

	public void save() throws IOException {
		SerializableStorage ss = new SerializableStorage();
		ss.save(this.frame.curCalendarMgr);
	}
	
}
