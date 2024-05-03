package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogsPage {

	public WebDriver idriver;
	
	public BlogsPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Blog')]") WebElement blogtablink;
	@FindBy(xpath="(//a[contains(text(),'Read More')])[2]") WebElement layerreadmorebtn;
	@FindBy(xpath="(//a[contains(text(),'Read More')])[4]") WebElement Understandreadmorebtn;
	@FindBy(xpath="(//a[contains(text(),'Read More')])[5]") WebElement Hardreadmorebtn;
	@FindBy(xpath="(//a[contains(@href, 'practice')])[7]") WebElement praticelink;
	@FindBy(xpath="//a[contains(text(), 'open-source automation tool')]") WebElement opensourcelink;
	
	public void blogspage()
	{
		blogtablink.click();
	}
	
	public void layerread()
	{
		layerreadmorebtn.click();
	}
	
	public void understandread()
	{
		Understandreadmorebtn.click();
	}
	
	public void hardread()
	{
		Hardreadmorebtn.click();
	}
	
	public void pratice()
	{
		praticelink.click();
	}
	
	public void opensource()
	{
		opensourcelink.click();
	}
}
