package actitime.Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import actitime.ObjectRepo.Homepage;
import actitime.ObjectRepo.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	WebDriver_Utility wutil=new WebDriver_Utility();
	Property_File_Utility putil=new Property_File_Utility();
	public static WebDriver driver=null;
	@BeforeSuite(alwaysRun = true)
	public void database() {
		System.out.println("data base connection happen sucessfully");
	}
	
	@BeforeClass(alwaysRun = true)
	public void launch() throws IOException, InterruptedException {
		String BROWSER = putil.readdatafromproperty("browser");
		String URL=putil.readdatafromproperty("url");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
			System.out.println("invalid browser");
		wutil.maximize(driver);
		wutil.wait(driver);
		driver.get(URL);

}
	@BeforeMethod(alwaysRun = true)
	public void loginto() throws IOException, InterruptedException {
		
		String UN=putil.readdatafromproperty("username");
		String PW=putil.readdatafromproperty("password");
		
		Loginpage lop=new Loginpage(driver);
		lop.login(UN, PW);
		Thread.sleep(5000);
	}
	@AfterMethod(alwaysRun = true)
	public void signoutnew() throws Exception {
		Thread.sleep(5000);
		Homepage hp=new Homepage(driver);
		hp.clickLogout();
		
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void connclose() {
		System.out.println("data base Conn close");
	}
}
