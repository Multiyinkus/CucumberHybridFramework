	package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 tags="@Login",
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})

public class TestRunner {

}
