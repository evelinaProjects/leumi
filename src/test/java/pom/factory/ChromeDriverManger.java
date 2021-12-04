package pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManger extends DriverManger{

    @Override
    protected void startDiver() {
        WebDriverManager.chromedriver().cachePath("drivers").setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
}
