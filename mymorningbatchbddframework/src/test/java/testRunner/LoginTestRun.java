package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= ".//Features/Login.feature",
		glue = "stepDefinitions",
		monochrome=true,
		plugin={"pretty", "html:test-outputnew"}
		
		
		
		)


public class LoginTestRun {
	
}
