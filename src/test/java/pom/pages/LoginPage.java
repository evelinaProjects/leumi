package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pom.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy(how = How.XPATH, using ="/html/head/title")
    private WebElement pageTitle;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        return pageTitle.getAttribute("innerHTML");
    }

}
