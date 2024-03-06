package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				features="Feature_Files",
				glue={"stepDefinition","hooks.com"},
				tags="@Regression",
				plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)



public class Runner {

	
	
	
}
