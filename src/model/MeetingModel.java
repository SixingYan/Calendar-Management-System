package model;

public class MeetingModel {

	public Meeting addPerson () {
		Person p = new Person(name);
		if !(meeting.people) {
			meeting.people.add(p);
		}
		return meeting;
	}

	public Meeting removePerson () {
		Person p = new Person(name);
		if (meeting.people.contains(p) ){
			int idx = meeting.people.indexOf(p);
			meeting.people.remove(idx);
		}
		return meeting;
	}

	public Meeting resetPerson () {
		meeting.setPeople(null);
	}

	public Meeting setLocation () {

	}
	

}
