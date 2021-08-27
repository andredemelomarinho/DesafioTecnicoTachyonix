package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PaginaBase {
    WebDriver driver;
    public PaginaBase(WebDriver driver) {
        this.driver = driver;
    }
    public PaginaBase() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    public void navegateTo(String url) {
        driver.get(url);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void closeNavegator() {
        getDriver().close();
    }
}
