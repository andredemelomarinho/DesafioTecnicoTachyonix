package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelececaoBuilderPage extends PaginaBase{
    protected PaginaBase paginaBase = new PaginaBase();
    public SelececaoBuilderPage (WebDriver driver){
        super(driver);
    }
    public void selecionaBuilder(){
        WebElement tipoaplicacao = driver.findElement(By.xpath("//div[@id='tiposAplicacao']/div[@role='button']"));
        tipoaplicacao.click();
    }
    public void selecionarPacote() throws InterruptedException {
        Thread.sleep(3000);
        WebElement pacote = driver.findElement(By.xpath("//ul/li[2]"));
        pacote.click();
    }
}
