package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PaginaBase{
    protected PaginaBase paginaBase = new PaginaBase();
    WebDriver driver = new ChromeDriver();
    public MainPage(){

    }
    public void acessandoUrl(){
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "src\\test\\driver\\chromedriver.exe");
        driver.get("https://qa02:Teste12345@s4hqa.tachyonix.io:44301/sap/bc/ui5_ui5/sap/Y_TSA_BUILDER/webapp/index.html#");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);
    }
    public void buttonCriarApp(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("__button2-content")));
        element.click();
    }

}
