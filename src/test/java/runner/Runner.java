package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = {"FeatureFiles"},
glue = {"stepsDefinitions","hooks"},
//tags = ("@recruitment"),
plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
dryRun = !true
)
public class Runner {
	
//allure generate --single-file allure-results
	
}
