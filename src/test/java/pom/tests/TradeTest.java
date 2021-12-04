package pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.base.BaseTest;
import pom.pages.*;


public class TradeTest extends BaseTest {

    @Test
    public void capitalMarketTest(){
        HomePage homePage = new HomePage(this.getDriver()).load().selectCapitalMarket();
        TradePage tradePage = homePage.clickOnTradeAndSwitchToTradePage();
        LoginPage loginPage = tradePage.selectLogin();
        Assert.assertTrue(loginPage.getTitle().contains("כניסה לחשבונך"),
                "\nExpected : בנק לאומי - כניסה לחשבונך - XXX_XXX - 3 \nActual : " + loginPage.getTitle());
    }
}
