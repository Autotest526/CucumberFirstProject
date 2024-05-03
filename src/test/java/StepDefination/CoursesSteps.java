package StepDefination;

import java.util.Set;

import org.junit.Assert;

import PageObjects.CoursesPage;
import TestBase.Baseclass;
import TestBase.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoursesSteps extends Baseclass {
	
      CoursesPage cp=new CoursesPage(driver);
	
	@Then("click on courses link")
	public void click_on_courses_link() {
	    cp.courcepagelink();
	}

	@When("click on start a free trail now button")
	public void click_on_start_a_free_trail_now_button() {
	    cp.monthly();
	}

	@When("click on enroll in this course on Udemy")
	public void click_on_enroll_in_this_course_on_udemy() {
	    cp.javabiggner();
	}

	@When("click on enroll in this course  exclusive on Udemy")
	public void click_on_enroll_in_this_course_exclusive_on_udemy() {
	    cp.pythonbiggner();
	}

	@Then("open page in next tab and title should be {string}")
	public void open_page_in_next_tab_and_title_should_be(String title) {
		multiplewindows();
		
	}

}
