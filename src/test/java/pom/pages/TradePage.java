package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.base.BasePage;

public class TradePage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[text()='כניסה לחשבונך']")
    private WebElement loginBtn;

    public TradePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage selectLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
        return new LoginPage(driver);
    }
}
