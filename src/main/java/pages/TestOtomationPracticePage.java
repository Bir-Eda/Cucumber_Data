package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestOtomationPracticePage {
    public WebDriver adriver;

    public TestOtomationPracticePage(WebDriver driver) {

        adriver =driver;
        PageFactory.initElements(adriver, this);

    }
    @FindBy(how = How.XPATH, using = "//*[text()='Click Me']")
    public WebElement alertButton;



}
