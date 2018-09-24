package controller;

public class CloseTimeplotController {
	MainFrame frame;

	public CloseTimeplotController (MainFrame frame) {
		this.frame = frame;
	}

	public void close(String year, String month, String day, Strin time) {
		
		SelectDateTimeDialog sdtd = new SelectDateTimeDialog();


		// several close situation
		// 1. 
		// 2. 
		// 3. 
		// 4. 
		



		Enumeration nameHT = this.frame.getCurCalendarMgr().keys();
		while (nameHT.hasMoreElements()){
			String n = nameHT.nextElement();
			Calendar c = .get(n);
			
			







				int t = digits
				if (t > startTimeDigit & (t - this.duration) < startTimeDigit){
					return false;
				}
				if (t < startTimeDigit & (t + this.duration) > startTimeDigit) {
					return false;
				}
			}

	}

}
