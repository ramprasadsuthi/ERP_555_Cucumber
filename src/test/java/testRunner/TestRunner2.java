package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"Features//HomePageModule.feature"},
		glue={"stepDefinition"},
	    dryRun=false,
	    tags= "@smokeTest",
		plugin = { "pretty", "html:target/cucumber-reports.html"},
		publish = true,
		monochrome = true)

public class TestRunner2 {
	
}
