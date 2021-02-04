package stepDefs;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TestO_SendKeysPage;

public class TestO_StepDef {
    WebDriver driver= BasePage.getDriver();
    TestO_SendKeysPage send=new TestO_SendKeysPage(driver);



}
