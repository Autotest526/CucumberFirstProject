package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {

	public WebDriver idriver;
	
	public PracticePage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Practice']") WebElement praticelink;
	@FindBy(xpath="//a[contains(text(), 'Test Login Page')]") WebElement testloginlink;
	@FindBy(xpath="//a[normalize-space()='Test Exceptions']") WebElement testexceptionlink;
	@FindBy(xpath="//button[@id='edit_btn']") WebElement editbuttonlink;
	@FindBy(xpath="//input[@class='input-field']") WebElement row1textbox;
	@FindBy(xpath="//button[@id='save_btn']") WebElement savebutton1;
	@FindBy(xpath="//button[@id='add_btn']") WebElement addbutton;
	@FindBy(xpath="(//input[@class='input-field'])[2]") WebElement row2textbox;
	@FindBy(xpath="(//button[@id='save_btn'])[2]") WebElement savebutton2;
	@FindBy(xpath="//button[@id='remove_btn']") WebElement removebutton;
	
	public void praticepagelink()
	{
		praticelink.click();
	}
	
	public void testlogin()
	{
		testloginlink.click();
	}
	
	public void testexception()
	{
		testexceptionlink.click();
	}
	
	public void editbutton()
	{
		editbuttonlink.click();
	}
	
	public void row1textbox()
	{
		row1textbox.clear();
		row1textbox.sendKeys("Biryan Test");
	}
	
	public void savebutton1()
	{
		savebutton1.click();
	}
	
	public void addbutton()
	{
		addbutton.click();
	}
	
	public void row2textbox()
	{
		row2textbox.sendKeys("Ice cream");
	}
	
	public void savebutton2()
	{
		savebutton2.click();
	}
	
	public void removebutton()
	{
		removebutton.click();
	}
	
	public void removebox2conformation(boolean flag)
	{
		boolean status=row2textbox.isDisplayed();
	}
}
