package testrunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Features/customers.feature",
		glue= "Stepdeffinitions",
		dryRun = true,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-report.html"}
		
		)
//html:test-output
public class Testrunner {

		
	
}
