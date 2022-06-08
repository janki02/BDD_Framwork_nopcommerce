package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"C:\\Users\\Janki_project\\BDD_Framwork_nopcommerce\\rc\\test\\recorses\\com\\feature"}, 
		 glue = {"StepDefinition","com.qa.hooks"},
		
		 plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"
			},
		 monochrome = true,
		 publish = true
		
			
			)  
public class MyTestRunner {

}
