package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue ="steps",
//		monochrome =true,
		dryRun= true
//		publish =true
		)

public class Runner {

}	


