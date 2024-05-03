package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import TestBase.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends Baseclass {
	
	HomePage  hp=new HomePage(driver);

	@When("click on homepage link")
	public void click_on_homepage_link() {
		//hp=new HomePage(driver);
          hp.clickhomepage();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
	}

	
	@Then("user enter first name {string}")
	public void user_enter_first_name(String uname) {
           hp.nametext(uname);
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user enter the email {string}")
	public void user_enter_the_email(String uemail) {
        hp.emailytext(uemail);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("clik on xpath chat sheet")
	public void clik_on_xpath_chat_sheet() {
         hp.clickxpath();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/*@Then("Enter the robottextbox {string}")
	public void enter_the_robottextbox(String rtext) {
	    hp.robottext(rtext);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Then("clik on getxpath chat sheet1")
	public void clik_on_getxpath_chat_sheet1() {
         hp.clickgetxpath1();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}*/

	@Then("clik on teturn to blog no older posts")
	public void clik_on_teturn_to_blog_no_older_posts() {
          hp.clickolderposts();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@Then("clik on teturn to blog no never posts")
	public void clik_on_teturn_to_blog_no_never_posts() {
       hp.clicknewerposts();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
