package stepDefs;

import base.BasePage;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void tearDown(){
        BasePage.closeBrowser();

    }
}
