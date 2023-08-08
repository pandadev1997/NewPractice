package actitime.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="username")
	private WebElement usernameEdt;
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void login(String username,String password) {
		getUsernameEdt().sendKeys(username);
		getPasswordEdt().sendKeys(password);
		getLoginBtn().click();
	}
	

}
