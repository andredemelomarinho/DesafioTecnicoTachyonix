package tests;
import Pages.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateApplication {
    private WebDriver driver;
    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa02:Teste12345@s4hqa.tachyonix.io:44301/sap/bc/ui5_ui5/sap/Y_TSA_BUILDER/webapp/index.html#");
        driver.manage().window().maximize();

    }
    @Test
    public void createApplication() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("__button2-content")));
        element.click();
        WebElement tipoaplicacao = driver.findElement(By.xpath("//div[@id='tiposAplicacao']/div[@role='button']"));
        tipoaplicacao.click();
        Thread.sleep(3000);
        WebElement pacote = driver.findElement(By.xpath("//ul/li[2]"));
        pacote.click();

        WebElement nameApp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Nome da aplicação']")));
        nameApp.sendKeys("Test Andre Application5");
        WebElement selPacote = driver.findElement(By.xpath("//input[@placeholder='Selecione um pacote']"));
        selPacote.click();
        WebElement campoBusca = driver.findElement(By.xpath("//div[@class='sapMSF sapMBarChild']/form/input[@type='search'][@placeholder='Procurar']"));
        campoBusca.sendKeys("YS_CDS");
        WebElement escolhePacote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sapMSLIDescription'][text()='YS_CDS']")));
        escolhePacote.click();

        Thread.sleep(2000);
        WebElement selRequest = driver.findElement(By.xpath("//input[@placeholder='Selecione uma request SAP ']"));
        selRequest.click();

        Thread.sleep(4000);
        WebElement escolheRequest = driver.findElement(By.xpath("//div[@class='sapMSLIDescription'][text()='S4QK900292']"));
        escolheRequest.click();
        Thread.sleep(2000);

        WebElement addDataSource = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Add Data Source Component']/span")));
        addDataSource.click();
        WebElement buscarDataSourceEKKO = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sapMSF sapMBarChild']/form/input[@type='search'][@placeholder='Procurar']")));
        buscarDataSourceEKKO.sendKeys("EKKO");

        Thread.sleep(2000);
        WebElement escolheDataSourceEKKO = driver.findElement(By.xpath("//div[@class='sapMSLIDescription'][text()='EKKO']"));
        escolheDataSourceEKKO.click();

        Thread.sleep(2000);
        addDataSource.click();
        WebElement buscarDataSourceEKPO = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sapMSF sapMBarChild']/form/input[@type='search'][@placeholder='Procurar']")));
        buscarDataSourceEKPO.sendKeys("EKPO");

        Thread.sleep(2000);
        WebElement escolheDataSourceEKPO = driver.findElement(By.xpath("//div[@class='sapMSLIDescription'][text()='EKPO']"));
        escolheDataSourceEKPO.click();
        WebElement relacionamento = driver.findElement(By.xpath("//*[@id='__table1-rows-row0-col2']/div"));
        String texto = relacionamento.getText();

        Thread.sleep(2000);
        WebElement layoutTab = driver.findElement(By.id("__filter3-icon"));
        layoutTab.click();
        Thread.sleep(2000);
        WebElement filtro = driver.findElement(By.xpath("//div[@class='sapMSF tachFieldSelectionFilter sapMBarChild']/form/input[@type='search']"));
        filtro.sendKeys("BUKRS");

        Thread.sleep(2000);
        WebElement selFiltro = driver.findElement(By.xpath("//a[text()='Empresa']"));
        selFiltro.click();

        Thread.sleep(2000);
        WebElement limpaFiltro = driver.findElement(By.id("__field1-reset"));
        limpaFiltro.click();

        Thread.sleep(2000);
        filtro.sendKeys("BSTYP");
        WebElement selFiltro2 = driver.findElement(By.xpath("//a[text()='Categoria do documento de compras']"));
        selFiltro2.click();
        WebElement selKey = driver.findElement(By.id("__button38-__clone390"));
        selKey.click();
        WebElement saveApp = driver.findElement(By.id("__button94"));
        saveApp.click();

        Thread.sleep(3000);
        WebElement textoSave = driver.findElement(By.id("__text172"));
        String validatextoSave = textoSave.getText();
        Assert.assertEquals("Mensagem não está correta", "Deseja realmente salvar a aplicação?", validatextoSave);
        WebElement buttonSav = driver.findElement(By.id("__button105"));
        buttonSav.click();
        
        Thread.sleep(30000);
        WebElement textoSucesso = driver.findElement(By.id("__text174"));
        String validaTexto = textoSucesso.getText();
        Assert.assertEquals("Mensagem não está correta", "Aplicação Test Andre Application salva com sucesso.", validaTexto);
    }

    }
