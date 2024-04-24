package StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@Given("user lauch Chrome browser")
	public void user_lauch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	    lp=new LoginPage(driver);
	    
	}

	@When("user open URL {string};")
	public void user_open_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		  
	}

	@When("user enter username  as {string}")
	public void user_enter_username_as(String uname) {
	    lp.Setusername(uname);
	    
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String upass) {
	    lp.Setpassword(upass);
	    
	}

	@When("click on Submit")
	public void click_on_submit() {
	   lp.ClickLogin();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	
	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	    
		if(driver.getPageSource().contains("Test Not working for this site")) // intentionally we provided wrong title so that else will execute
		{
			driver.close();
			Assert.assertTrue(false);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
		
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
	    lp.ClickLogout();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	   
	}

	
	

}
