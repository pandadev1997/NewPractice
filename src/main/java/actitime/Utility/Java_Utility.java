package actitime.Utility;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
	public int getRandom() {
		Random r = new Random();
		return r.nextInt(1000);
	}

	public String sysdateformat() {
		Date d=new Date();
		return d.toString();
	}

}
