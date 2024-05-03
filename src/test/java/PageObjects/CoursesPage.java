package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {

	   public WebDriver idriver;
	   
	  public CoursesPage(WebDriver rdriver)
	  {
		  idriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	  @FindBy(xpath="//a[normalize-space()='Courses']") WebElement courcelink;
	  @FindBy(xpath="//a[contains(text(),'Start a Free Trial Now!')]") WebElement monthlylink;
	  @FindBy(xpath="(//*[normalize-space()='Enroll in this course on Udemy'])[1]") WebElement javabiggnerlink;
	  @FindBy(xpath="(//*[contains(text(),'Enroll in this course exclusively on Udemy')])[1]") WebElement pythonbiggnerlink;
	  
	  public void courcepagelink()
	  {
		  courcelink.click();
	  }
	  
	  public void monthly()
	  {
		  monthlylink.click();
	  }
	  
	  public void javabiggner()
	  {
		  javabiggnerlink.click();
	  }
	  
	  public void pythonbiggner()
	  {
		  pythonbiggnerlink.click();
	  }
}
