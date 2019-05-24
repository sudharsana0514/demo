package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/AddCustomer.feature",dryRun=false,strict=true,monochrome=true,glue="stepDefinition",
                                          plugin= {"html:target","json:target/report.json"})

public class TestRunner {

}
