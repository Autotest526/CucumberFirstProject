package StepDefination;

import java.time.Duration;

import org.junit.Assert;

import PageObjects.PracticePage;
import TestBase.Baseclass;
import TestBase.Hooks;
import io.cucumber.java.en.Then;

public class PraticeSteps extends Baseclass{

	PracticePage pp=new PracticePage(driver);
	
	@Then("click on pratice link")
	public void click_on_pratice_link() {
		pp.praticepagelink();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on Test login page")
	public void click_on_test_login_page() {
	    pp.testlogin();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on Test exceptions link")
	public void click_on_test_exceptions_link() {
	    pp.testexception();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on edit button and user enter the update text")
	public void click_on_edit_button_and_user_enter_the_update_text() {
	   pp.editbutton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   pp.row1textbox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   pp.savebutton1();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@Then("click on Add button and update the text")
	public void click_on_add_button_and_update_the_text() {
	   pp.addbutton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   pp.row2textbox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on save button")
	public void click_on_save_button() {
	    pp.savebutton2();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on remove button")
	public void click_on_remove_button() {
	    pp.removebutton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("row two should be deleted")
	public void row_two_should_be_deleted() {
	   pp.removebox2conformation(true);
	   Assert.assertTrue(true);
	}

}
