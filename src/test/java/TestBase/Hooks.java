package TestBase;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import PageObjects.BlogsPage;
import PageObjects.ContactPage;
import PageObjects.CoursesPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PracticePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	/*public  WebDriver driver;
	public  LoginPage lp;
	
	@Parameters("browser")
	public  void lauchBrowsers(String br)
	{
		if(br.equals("chrome"))
		{
		System.out.println("Test browser in chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("chrome test");
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if(br.equals("Headless"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions headchrome=new ChromeOptions();
			headchrome.addArguments("headless");
			driver = new ChromeDriver(headchrome);
		}
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
	}*/
	
}
