package actitime.Utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void alertpopup(WebDriver driver) {
		Alert act=driver.switchTo().alert();
		act.accept();
	}
	
	

}
