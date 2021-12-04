package pom.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.factory.DriverManger;
import pom.factory.DriverMangerFactory;

public class BaseTest {
    private DriverManger driverManger;

    @BeforeMethod
    public void startDriver(){
        driverManger = DriverMangerFactory.getManager();
        driverManger.getDriver();
    }

    @AfterMethod
    public void quitDriver(){
        driverManger.quitDriver();
    }

    public WebDriver getDriver() {
        return driverManger.getDriver();
    }

}

