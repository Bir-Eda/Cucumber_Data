package stepDefs;

import base.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.PointsBetLoginPage;

import java.util.List;


public class PointsBetStepDef extends BasePage {
    WebDriver driver;
    PointsBetLoginPage p=new PointsBetLoginPage(driver);


    @Given("^I am on the PointsBet homepage$")
    public void i_am_on_the_PointsBet_homePage()  {
        driver.get("https://nj.pointsbet.com/");
// dogru sitedemiyim assert ediyorum
        Assert.assertEquals(driver.getTitle(),"PointsBet", "Fail");
    }
    @When("^I click on login button$")
    public void i_click_on_button(WebElement element) throws InterruptedException {
        Thread.sleep(2000);
        element= p.loginBtn;
        element.click();

    }
    @Then("^I verify the account login pop up$")
    public void i_verify_the_account_login_pop_up() throws InterruptedException {
        //  uyari mesajini almak icin gettext yapmamiz lazim
        // Stringe mesaji depolicaz
        Thread.sleep(2000);
        Assert.assertEquals(p.popupTitle.getText(),"ACCOUNT LOG IN", "Fail" );
    }
    @When("^I enter credentials$")
    public void i_enter_credentials(DataTable data) throws InterruptedException {
        List<List<String>> list=data.asLists();
        Thread.sleep(2000);
        p.emailBox.sendKeys(list.get(1).get(0));
        p.passwordBox.sendKeys(list.get(1).get(1));
    }
    @When("^I should see a warning$")
    public void i_should_see_a_warning() throws InterruptedException {
        Thread.sleep(15000);
        String warning = p.warningMessage.getText();
        Assert.assertEquals(warning, "Incorrect email or password.");
        driver.close();

    }
    @Then("^I click on submit button$")
    public void i_click_on_submit_button() throws InterruptedException {
        Thread.sleep(2000);
        p.submitBtn.click();
    }


}
