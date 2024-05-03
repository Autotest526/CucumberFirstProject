package StepDefination;

import java.time.Duration;

import org.junit.Assert;

import PageObjects.ContactPage;
import TestBase.Baseclass;
import TestBase.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSteps extends Baseclass {

	ContactPage cp1=new ContactPage(driver);
	
	@Then("click on the contact link")
	public void click_on_the_contact_link() {
	   cp1.contactpage();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enter first name one {string}")
	public void user_enter_first_name_one(String cfirst) {
	    cp1.firstnameone(cfirst);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enter last name {string}")
	public void user_enter_last_name(String slast) {
	    cp1.lastname(slast);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("user enter message {string}")
	public void user_enter_message(String ccom) {
	    cp1.comment(ccom);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on i am robot check box")
	public void click_on_i_am_robot_check_box() {
	    cp1.robot();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on Submit button")
	public void click_on_submit_button() {
	    cp1.submitbutton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("Succesfully submited message should display {string}")
	public void succesfully_submited_message_should_display(String exp_errmsg) {
	    String acc_errmsg=cp1.thanksmsg();
	   Assert.assertEquals(exp_errmsg,acc_errmsg );
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("user enter email {string}")
	public void user_enter_email(String cemail) {
	    cp1.email(cemail);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user not enter first name one")
	public void user_not_enter_first_name_one() {
	    cp1.firstnameone(null);
	}

	@When("user not enter last name")
	public void user_not_enter_last_name() {
	    cp1.lastname(null);
	}

	@When("user  not enter email")
	public void user_not_enter_email() {
	    cp1.email(null);
	}

	@When("user not enter message")
	public void user_not_enter_message() {
	    cp1.comment(null);
	}

	@Then("Error message should display for robot check box {string}")
	public void error_message_should_display_for_robot_check_box(String exp_rbot) {
		String acc_robt=cp1.roboterrmsg();
	    Assert.assertEquals(acc_robt, exp_rbot);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("firstname should display mandetroy field error message {string}")
	public void firstname_should_display_mandetroy_field_error_message(String exp_first) {
	    String acc_first=cp1.firsterrmsg();
	    Assert.assertEquals(acc_first, exp_first);
	}

	@Then("lastname should display mandetroy field error message {string}")
	public void lastname_should_display_mandetroy_field_error_message(String exp_last) {
	    String acc_last=cp1.lasterrmsg();
	    Assert.assertEquals(acc_last, exp_last);
	}

	@Then("email should display mandetroy field error message {string}")
	public void email_should_display_mandetroy_field_error_message(String exp_email) {
	    String acc_email=cp1.emailerrmsg();
	    Assert.assertEquals(acc_email, exp_email);
	}

	@Then("comment should display mandetroy field error message {string}")
	public void comment_should_display_mandetroy_field_error_message(String exp_comment) {
	    String acc_comment=cp1.commenterrmsg();
	    Assert.assertEquals(acc_comment, exp_comment);
	}


}
