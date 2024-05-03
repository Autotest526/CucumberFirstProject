package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ContactPage {

	public WebDriver idriver;
	
	public ContactPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Contact']")WebElement contactlink;
	@FindBy(xpath="//input[@id='wpforms-161-field_0']") WebElement firsnamebox;
	@FindBy(xpath="//input[@id='wpforms-161-field_0-last']")WebElement lastnamebox;
	@FindBy(xpath="//input[@id='wpforms-161-field_1']") WebElement emailbox;
	@FindBy(xpath="//textarea[@id='wpforms-161-field_2']") WebElement commentbox;
	@FindBy(id="recaptcha-anchor") WebElement robotbox;
	@FindBy(xpath="//button[@id='wpforms-submit-161']") WebElement submitbtn;
	@FindBy(xpath="(//label[contains(text(),'This field is required.')])[1]") WebElement firstnameerrormsg;
	@FindBy(xpath="(//label[contains(text(),'This field is required.')])[2]") WebElement lastnameerrormsg;
	@FindBy(xpath="(//label[contains(text(),'This field is required.')])[3]") WebElement emailerrormsg;
	@FindBy(xpath="(//label[contains(text(),'This field is required.')])[4]") WebElement commenterrormsg;
	@FindBy(xpath="//label[contains(text(),'Google reCAPTCHA verification failed, please try again later.')]") WebElement robotterrormsg;
	@FindBy(xpath="//p[contains(text(),'Thanks for contacting us! We will be in touch with you shortly.')]") WebElement confmsg;
	
	public void contactpage()
	{
		contactlink.click();
	}
	
	public void firstnameone(String cfirst)
	{
		firsnamebox.sendKeys(cfirst);
	}
	
	public void lastname(String clast)
	{
		lastnamebox.sendKeys(clast);
	}
	
	public void email(String cemail)
	{
		emailbox.sendKeys(cemail);
	}
	
	public void comment(String ccomm)
	{
		commentbox.sendKeys(ccomm);
	}
	
	public void robot()
	{
		robotbox.click();
	}
	
	public void submitbutton()
	{
		submitbtn.click();
	}
	
	public String firsterrmsg()
	{
		return firstnameerrormsg.getText();
	}
	
	public String lasterrmsg()
	{
		return lastnameerrormsg.getText();
		
	}
	
	public String emailerrmsg()
	{
		return emailerrormsg.getText();
		
	}
	
	public String commenterrmsg()
	{
		return commenterrormsg.getText();
	}
	
	public String roboterrmsg()
	{
		return robotterrormsg.getText();
	}
	
	public String thanksmsg() //example for confirmation check with errors
	{
		return confmsg.getText();
	}
}
