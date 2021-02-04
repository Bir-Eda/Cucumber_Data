package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PointsBetLoginPage {
    public WebDriver driver;

    public PointsBetLoginPage(WebDriver driver) {

        this.driver =driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy(how = How.XPATH, using = "//*[text()='Log in']")
    public WebElement loginBtn;
    //  driver.findElement(By.xpath("locator))

    @FindBy(how = How.CSS, using = "[class='flxy87k']")
    public WebElement popupTitle;

    @FindBy(how = How.XPATH, using = "//*[@class='f15mubio']")
     public static WebElement  emailBox;

    @FindBy(how = How.XPATH, using = "//*[@name='password']")
    public WebElement passwordBox;


    @FindBy(how = How.XPATH, using = "//*[text()='Log In']")
    public WebElement submitBtn;

    @FindBy(how = How.XPATH, using ="//*[@class='f2qlft0']/following-sibling::div[2]//span")
    public WebElement warningMessage;


}
















