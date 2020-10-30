package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@RegressionTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)


public class _04_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
