package actitime.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actitime.Utility.WebDriver_Utility;

public class Homepage extends WebDriver_Utility {
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskBtn;
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reportBtn;
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userBtn;
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutBtn;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getTaskBtn() {
		return taskBtn;
	}
	public WebElement getReportBtn() {
		return reportBtn;
	}
	public WebElement getUserBtn() {
		return userBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public void clickTask() {
		taskBtn.click();
	}
	public void clickReports() {
		reportBtn.click();
	}
	public void clickUsers() {
		userBtn.click();
	}
	public void clickLogout() {
		logoutBtn.click();
	}
	
	
	
	
	
	

}
