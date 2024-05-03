package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver idriver;
	
	 public HomePage(WebDriver rdriver)
	 {
		 idriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(xpath="//a[normalize-space()='Home']") WebElement hometablink;
	 @FindBy(xpath="//input[@id='form_first_name_7']") WebElement nametxt;
	 @FindBy(xpath="//input[@id='form_email_7']") WebElement emailtxt;
	 @FindBy(xpath="//input[@type='submit']") WebElement getxpathbtn;
	// @FindBy(xpath="//*[@class='mailpoet_text']") WebElement robottxt;
	// @FindBy(xpath="//*[@class='mailpoet_submit']") WebElement getxpathbtn1;
	 @FindBy(xpath="//div[@class='previous']") WebElement olderpostbtn;
	 @FindBy(xpath="//div[@class='next']") WebElement newerpostbtn;
	 @FindBy(xpath="//img[@title='CAPTCHA']") WebElement capchatxt;
	 @FindBy(xpath="//li[@class='parsley-required']") WebElement errormesg;
	 
	 public void clickhomepage()
	 {
		 hometablink.click();
	 }
	 
	 public void nametext(String hname)
	 {
		 nametxt.sendKeys(hname);
	 }
	
	 
	 public void emailytext(String hemail)
	 {
		 emailtxt.sendKeys(hemail);
	 }
	 
	 public void clickxpath()
	 {
		 getxpathbtn.click();
	 }
	 
	 /*public void robottext(String rtext)
	 {
		 robottxt.sendKeys(rtext);
	 }
	 
	 public void clickgetxpath1()
	 {
		 getxpathbtn1.click();
	 }*/
	 
	 public void clickolderposts()
	 {
		 olderpostbtn.click();
	 }
	 
	 public void clicknewerposts()
	 {
		 newerpostbtn.click();
	 }
	 
	
	 
	 
}
