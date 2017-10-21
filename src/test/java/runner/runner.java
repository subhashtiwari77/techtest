package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,features="src/test/resources",
	plugin = { "pretty", "html: cucumber-html-reports",
		 "junit: cucumber-html-reports/cucumber.xml" },
		dryRun = false,
		glue = "stepDefinitions",
		tags = {"~@ignore", "@runThis"})


public class runner {

}
