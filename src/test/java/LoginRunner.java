import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {"steps"})
public class LoginRunner {
}
