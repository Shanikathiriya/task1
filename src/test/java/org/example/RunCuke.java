
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "  @AdditionOperations", plugin =  { "pretty", "html:target/cucumber/report.html" } )

public class RunCuke {


}



