package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.base.BasePage;
import pom.utils.ConfigLoader;


public class HomePage extends BasePage {
    @FindBy(how = How.XPATH, using = "//a[@title='שוק ההון']")
    private WebElement capitalMarketBtn;
    @FindBy(how = How.XPATH, using = "//a[@title='ללאומי טרייד']")
    private WebElement tradeBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage selectCapitalMarket(){
        wait.until(ExpectedConditions.elementToBeClickable(capitalMarketBtn)).click();
        return this;
    }

    public HomePage load() {
        driver.get(ConfigLoader.getInstance().getURL());
        return new HomePage(driver);

    }

    public TradePage clickOnTradeAndSwitchToTradePage() {
        wait.until(ExpectedConditions.elementToBeClickable(tradeBtn)).click();
        switchWindow();
        return new TradePage(driver);
    }

}
