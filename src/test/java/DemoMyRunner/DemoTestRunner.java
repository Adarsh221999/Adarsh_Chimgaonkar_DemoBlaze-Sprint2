package DemoMyRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/DemoFeatures",
		glue = "DemoStepDef",
				dryRun = false, 
				plugin = {
				"html:Reports/HTMLReport", "json:target/Jsonreport.json", "junit:Reports/JUnitReport.xml" }
		)

public class DemoTestRunner extends AbstractTestNGCucumberTests {
	//@Override
    //@DataProvider(parallel = true)
    //public Object[][] scenarios() {
    //    return super.scenarios();
    //}

}

