package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	
	public WebDriver idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username") WebElement textEmail;
	@FindBy(id="password") WebElement textPass;
	@FindBy(id="submit") WebElement btnSubmit;
	@FindBy(xpath="//a[contains(text(),'Log out')]") WebElement logoutBtn;
	
	
	public void Setusername(String uname)
	{
		textEmail.sendKeys(uname);
	}
	
	public void Setpassword(String upass)
	{
		textPass.sendKeys(upass);
	}
	
	public void ClickLogin()
	{
		btnSubmit.click();
	}
	
	public void ClickLogout()
	{
		logoutBtn.click();
	}
}
