package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestO_SendKeysPage {
    public WebDriver sdriver;

    public TestO_SendKeysPage(WebDriver driver) {

        sdriver = driver;
        PageFactory.initElements(sdriver, this);
    }
        @FindBy(id="email")
        public WebElement firstnameBox;
        @FindBy(id="pass")
        public WebElement lastnameBox;
    }




