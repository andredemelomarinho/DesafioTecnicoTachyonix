package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LayoutPage extends  PaginaBase{
    protected PaginaBase paginaBase = new PaginaBase();

    public LayoutPage (WebDriver driver){

        super(driver);
    }
    public void alterToLayoutTab() throws InterruptedException {
        Thread.sleep(2000);
        WebElement layoutTab = driver.findElement(By.id("__filter3-icon"));
        layoutTab.click();
    }
    public void fillSerachFilter(String filter) throws InterruptedException {
        Thread.sleep(2000);
        WebElement filtro = driver.findElement(By.xpath("//div[@class='sapMSF tachFieldSelectionFilter sapMBarChild']/form/input[@type='search']"));
        filtro.sendKeys("filter");
    }
    public void selFilter(String filter) throws InterruptedException {
        Thread.sleep(2000);
        WebElement selFiltro = driver.findElement(By.xpath("//a[text()='"+filter+"']"));
        selFiltro.click();
    }
    public void cleanFilterField() throws InterruptedException {
        Thread.sleep(2000);
        WebElement limpaFiltro= driver.findElement(By.id("__field1-reset"));
        limpaFiltro.click();
    }
    public void selKey(){
        WebElement selKey= driver.findElement(By.id("__button38-__clone390"));
        selKey.click();
    }
    public void saveApp(){
        WebElement saveApp= driver.findElement(By.id("__button94"));
        saveApp.click();
    }
    public void confirmSave() throws InterruptedException {
        Thread.sleep(3000);
        WebElement textoSave = driver.findElement(By.id("__text172"));
        String validatextoSave= textoSave.getText();
        Assert.assertEquals("Mensagem não está correta","Deseja realmente salvar a aplicação?",validatextoSave);
        WebElement buttonSav = driver.findElement(By.id("__button105"));
        buttonSav.click();
    }
    public void validateApplicationSaved() throws InterruptedException {
        Thread.sleep(30000);
        WebElement textoSucesso = driver.findElement(By.id("__text174"));
        String validaTexto= textoSucesso.getText();
        Assert.assertEquals("Mensagem não está correta","Aplicação Test Andre Application salva com sucesso.",validaTexto);
    }
}
