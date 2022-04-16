package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",   //path of the feature file
		glue="stepDefination",//path of the java implimentation package name
		monochrome = true
	
		)
public class TestRunner {

}
