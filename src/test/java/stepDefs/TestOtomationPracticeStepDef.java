package stepDefs;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.TestO_SendKeysPage;
import pages.TestOtomationPracticePage;

public class TestOtomationPracticeStepDef{
    WebDriver driver= BasePage.getDriver();
    TestO_SendKeysPage t= new TestO_SendKeysPage(driver);

    @When("^I enter text (.+)$")
    public void i_enter_credentials_as_and(String firstname)  {
        t.firstnameBox.sendKeys(firstname);
    }
    @When("^I enter credentials (.+)$")
    public void lastname(String lastname)  {
        t.lastnameBox.sendKeys(lastname);
    }
    @Given("I am on the Facebook homepage")
    public void iAmOnTheAutomationPracticePageHomepage() {
        driver.get("https://www.facebook.com/");
    }



}
