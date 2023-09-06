package org.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/resources", 
glue = "org.StepDefinition", 
monochrome = true, 
dryRun = false,
plugin = {"html:report","junit:report\\JunitReport.xml","json:report\\JasonReport.jason"}
)

public class TestRunnerClass {
	

}
