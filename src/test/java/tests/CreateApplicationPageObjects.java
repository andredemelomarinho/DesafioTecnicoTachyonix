package tests;
import Pages.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateApplicationPageObjects {
    protected PaginaBase paginaBase = new PaginaBase();
    protected AplicacaoPage aplicacaoPage;
    protected LayoutPage layoutPage;
    protected MainPage mainPage;
    protected SelececaoBuilderPage selececaoBuilderPage;
    private WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\driver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://qa02:Teste12345@s4hqa.tachyonix.io:44301/sap/bc/ui5_ui5/sap/Y_TSA_BUILDER/webapp/index.html#");
        driver.manage().window().maximize();
    }
    @Test
    public void createApplicationPO() throws InterruptedException {
        criarAppButton();
        selecionaBuilder();
        selecionaPacote();
        applicationPageActions();
        layoutPageActions();
    }
    private void criarAppButton(){
        this.mainPage.buttonCriarApp(driver);
    }
    private void selecionaBuilder(){
        this.selececaoBuilderPage.selecionaBuilder();
    }
    private void selecionaPacote() throws InterruptedException {
        this.selececaoBuilderPage.selecionarPacote();
    }
    private void applicationPageActions() throws InterruptedException {
        this.aplicacaoPage.fillAplicationName("Teste Andre APP2");
        this.aplicacaoPage.buttonselecionaPacoteSap();
        this.aplicacaoPage.fillSearchPackage("YS_CDS");
        this.aplicacaoPage.selectPackage("YS_CDS");
        this.aplicacaoPage.buttonselRequestSap();
        this.aplicacaoPage.fillSearchRequest("S4QK900292");
        this.aplicacaoPage.buttonAddDataSource();
        this.aplicacaoPage.searchDataSource("EKKO");
        this.aplicacaoPage.selDataSource("EKKO");
        this.aplicacaoPage.buttonAddDataSource();
        this.aplicacaoPage.searchDataSource("EKPO");
        this.aplicacaoPage.selDataSource("EKPO");
        this.aplicacaoPage.AssetRelacionShip();
    }
    private void layoutPageActions()throws InterruptedException{
        this.layoutPage.alterToLayoutTab();
        this.layoutPage.fillSerachFilter("BUKRS");
        this.layoutPage.selFilter("Empresa");
        this.layoutPage.cleanFilterField();
        this.layoutPage.fillSerachFilter("BSTYP");
        this.layoutPage.selFilter("Categoria do documento de compras");
        this.layoutPage.selKey();
        this.layoutPage.saveApp();
        this.layoutPage.confirmSave();
        this.layoutPage.validateApplicationSaved();
    }

}
