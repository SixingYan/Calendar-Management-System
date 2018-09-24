package storage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import model.Calendar;

public class SerializableStorage{
	private String address;
	public SerializableStorage() {
		this.address = "temp.out";
	}
	public SerializableStorage(String address) {
		this.address = address;
	}
	public void save (Hashtable<String, Calendar> calendarMgr) throws IOException {
		FileOutputStream fos = new FileOutputStream(this.address);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(calendarMgr);
		oos.flush();
		oos.close();
	}
	
	public Hashtable<String, Calendar> read () throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("temp.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hashtable<String, Calendar> calendarMgr = (Hashtable<String, Calendar>) ois.readObject();
		ois.close();
		return calendarMgr;
		
	}
}
