package TestRunner;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
    (
		features={".//Features/Blogs.feature"},
		glue={"StepDefination","TestBase"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output.html"}
    		
	)
public class Testrun extends AbstractTestNGCucumberTests {

	/*@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}*/
}
