package TestAuto.SeleniumTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/resources",
		glue="stepDefinitions",
		format = {"pretty", "html:target/cucumber"}
		)
public class TestRunner {

}
