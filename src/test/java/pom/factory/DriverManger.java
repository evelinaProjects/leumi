package pom.factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManger {
    protected WebDriver driver;

    protected abstract void startDiver();

    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if(driver == null){
            startDiver();
        }
        return driver;
    }
}
