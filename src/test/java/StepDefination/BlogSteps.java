package StepDefination;

import java.time.Duration;

import PageObjects.BlogsPage;
import TestBase.Baseclass;
import TestBase.Hooks;
import io.cucumber.java.en.Then;

public class BlogSteps extends Baseclass{

	BlogsPage bp=new BlogsPage(driver);
	
	@Then("user click on blogs")
	public void user_click_on_blogs() {
	    bp.blogspage();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on read more button for layer of the pyramid")
	public void click_on_read_more_button_for_layer_of_the_pyramid() {
	    bp.layerread();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on read more button for understanding selenium")
	public void click_on_read_more_button_for_understanding_selenium() {
	   bp.understandread();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("user click on open source automation tools")
	public void user_click_on_open_source_automation_tools() {
	    bp.opensource();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("click on read more button for hard and soft assertions")
	public void click_on_read_more_button_for_hard_and_soft_assertions() {
	    bp.hardread();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("user click on pratice test link page")
	public void user_click_on_pratice_test_link_page() {
	    bp.pratice();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


}
