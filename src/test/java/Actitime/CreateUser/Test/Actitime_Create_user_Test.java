package Actitime.CreateUser.Test;

import org.testng.annotations.Test;

import actitime.ObjectRepo.Homepage;
import actitime.Utility.Base_Class;

public class Actitime_Create_user_Test extends Base_Class {
@Test
public void createUser() throws InterruptedException {
	Thread.sleep(5000);
	Homepage hp=new Homepage(driver);
	hp.clickTask();
	//System.out.println("run");
	
}

}
