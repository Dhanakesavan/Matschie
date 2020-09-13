package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/ChangeRequest.feature",
				 glue = {"steps","hooks"},
				 monochrome = true)

public class RunTest extends AbstractTestNGCucumberTests{

}

