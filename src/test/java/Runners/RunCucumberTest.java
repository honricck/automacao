package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        features = {"src/test/resources/Features"},
        tags = "@fullThings",
        glue = {"Steps"})

public class RunCucumberTest extends RunnerBase {
    @AfterClass

    public static void stop() {driver.quit();}
}
