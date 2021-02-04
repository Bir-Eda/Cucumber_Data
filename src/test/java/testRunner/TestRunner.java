package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",

        glue = {"stepDefs"},

        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/cucumber-html-reports"}
                // pluginin calismasi icin pom`a masterthought eklenir

       // tags = {"@alert"}
      //  tags= {"@sendKeys"}


)
public class TestRunner extends AbstractTestNGCucumberTests {
    // testlerimizi testNG formatinda calistiriyor, io.cucumber dan geliyor
}
