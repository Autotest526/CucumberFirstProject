package TestRunner;


import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
    (
		features=".//Features/Login.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output.html"}
    		
	)
public class Testrun extends AbstractTestNGCucumberTests {

}
