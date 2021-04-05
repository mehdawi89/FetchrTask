package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/Features/HomePage.feature"
 ,glue="StepDefinitions",tags= {"@smoke"})


public class TestRunner  {
	
	

}
