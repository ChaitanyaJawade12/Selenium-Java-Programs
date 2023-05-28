package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= ".//FeaturesFortags/TagsPractice.feature",
		glue = "stepDefinitions",
		dryRun= true,
	    monochrome=true,
	    tags= "@Sanity and @Regression" ,
plugin={"pretty", "html:test-outputnew"}
		
		
		
		)



public class TagsTest {
}