package cucumberExamples;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		//How to run multiple feature files
		
		features = {"E:\\SeleniumFrame_Works\\Cucumber_Framework\\CucumberTest\\Cucucmber_Files\\Login.feature",	
				   "E:\\SeleniumFrame_Works\\Cucumber_Framework\\CucumberTest\\Cucucmber_Files\\Amazon_Search.feature"},
					glue = "cucumberExamples",
				//plugin = { "pretty", "html:target/cucumber-reports" },
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
				plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml","junit:target/cucumber-reports/Cucumber.xml"},
				
				
				
		dryRun = false,
		monochrome=true
		
		
		)

public class Cucumber_TestRunner_Class extends AbstractTestNGCucumberTests {
	
	
	
	

}
