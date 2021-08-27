package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AplicacaoPage extends PaginaBase{
    protected PaginaBase paginaBase = new PaginaBase();

    public AplicacaoPage (WebDriver driver){

        super(driver);
    }
    public void fillAplicationName(String name){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement nameApp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Nome da aplicação']")));
        //WebElement nameApp = driver.findElement(By.xpath("//input[@placeholder='Nome da aplicação']"));
        nameApp.sendKeys(name);
    }
    public void buttonselecionaPacoteSap(){
        WebElement selPacote = driver.findElement(By.xpath("//input[@placeholder='Selecione um pacote']"));
        selPacote.click();
    }
    public void fillSearchPackage(String pack){
        WebElement campoBusca = driver.findElement(By.xpath("//div[@class='sapMSF sapMBarChild']/form/input[@type='search'][@placeholder='Procurar']"));
        campoBusca.sendKeys(pack);
    }
    public void selectPackage(String pack){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement escolhePacote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sapMSLIDescription'][text()='"+pack+"']")));
        escolhePacote.click();
    }
    public void buttonselRequestSap() throws InterruptedException {
        Thread.sleep(2000);
        WebElement selRequest = driver.findElement(By.xpath("//input[@placeholder='Selecione uma request SAP ']"));
        selRequest.click();
    }
    public void fillSearchRequest(String request) throws InterruptedException {
        Thread.sleep(4000);
        WebElement escolheRequest = driver.findElement(By.xpath("//div[@class='sapMSLIDescription'][text()='"+request+"']"));
        escolheRequest.click();
    }
    public void buttonAddDataSource() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        Thread.sleep(2000);
        WebElement addDataSource = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Add Data Source Component']/span")));
        addDataSource.click();
    }
    public void searchDataSource(String data){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement buscarDataSource =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sapMSF sapMBarChild']/form/input[@type='search'][@placeholder='Procurar']")));
        buscarDataSource.sendKeys(data);
    }
    public void selDataSource(String data) throws InterruptedException {
        Thread.sleep(2000);
        WebElement escolheDataSourceEKKO = driver.findElement(By.xpath("//div[@class='sapMSLIDescription'][text()='"+data+"']"));
        escolheDataSourceEKKO.click();
    }
    public void AssetRelacionShip(){
        WebElement relacionamento = driver.findElement(By.xpath("//*[@id='__table1-rows-row0-col2']/div"));
        String texto =relacionamento.getText();
        //Assert.assertEquals("Relacionamento não encontrado","INNERJOIN",texto);
    }


    }
