package TestBase;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public  LoginPage lp;
	
	
	public  void lauchBrowsers()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//lp = new LoginPage(driver);
			
	}
	
	public void launchURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void multiplewindows()
	{
		Set<String> windowids= driver.getWindowHandles();
		   for(String wind:windowids)
		   {
			  String pagetitles = driver.switchTo().window(wind).getTitle();
			  if(pagetitles.equals("Courses | Practice Test Automation")|| pagetitles.equals("Practice Test Automation School")||
				 pagetitles.equals("Selenium WebDriver with Java for beginners | Udemy")|| pagetitles.equals("Selenium WebDriver: Selenium Automation Testing with Python | Udemy") || 
				 pagetitles.equals("Blog | Practice Test Automation")|| pagetitles.equals("Unlock the Potential: Mastering the Test Automation Pyramid | Practice Test Automation")|| pagetitles.equals("Starting with Selenium WebDriver and Java: An Overview for Beginners | Practice Test Automation")||
				 pagetitles.equals("Selenium")|| pagetitles.equals("Hard and Soft Assertions in test automation | Practice Test Automation")|| pagetitles.equals("Test Login | Practice Test Automation"))
			  {
				  driver.close();
			  }
	 }
	}
}
