package Test_Runner25;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import Util25.TestBase25;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features = {"src/test/resources/Features25"} , // Cucumber options
            // Features = to locate the Feature File// take the location of feature folder//
plugin = {"json:target/cucumber.json"},                       // Plugin = to generate reports
glue = "SteppDefini") //tags= {"@S"})                                 // Glue = to locate the Step Definition File
            // Tags = to execute a specific Scenario from the Feature File

	public class TestRunner25 extends AbstractTestNGCucumberTests { // extends AbstractTestNGCucumberTests class

		@BeforeTest    // Cucumber Hooks // @BeforeTest STARTS BROWSER SHOULD OPEN 

		public void Setup25() {
			
			TestBase25 test= new TestBase25();
			test.initil();

			
			
		}

		@AfterTest     // @AfterTest BROWSER SHOULD CLOSE

		public void tearDown25() {
			TestBase25 test= new TestBase25();
			test.driver.quit();
			
		}
			
			
			
			
}
