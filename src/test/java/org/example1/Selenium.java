package org.example1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.example.LoginPage;
import org.test.pages.*;
import org.testng.annotations.*;

public class Selenium {
    WebDriver driver;
    LoginPage loginPage;
    MyAccount myac;
    ShopPage sp;
    AndroidPage ap;
    AndroidBookPage abp;
    AddToBasketPage atbp;
    ViewBasketPage vbp;
    CheckOutPage cop;
    private ConfigReader configReader;

    @BeforeClass
    public void setUp(){
        configReader = new ConfigReader();
        System.setProperty("webdriver.edge.driver", "D:\\programs\\edgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        loginPage = new LoginPage(driver);
        myac = new MyAccount(driver);
        sp = new ShopPage(driver);
        ap = new AndroidPage(driver);
        atbp = new AddToBasketPage(driver);
        vbp = new ViewBasketPage(driver);
        abp = new AndroidBookPage(driver);
        cop = new CheckOutPage(driver);

    }
    @Test
    public void printDetails() {

        String browser = configReader.getProperty("browser");
        String url = configReader.getProperty("url");
        String username = configReader.getProperty("username");
        String password = configReader.getProperty("password");

        // Use the retrieved values in your test logic
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Test
    public void test_LoginCredentails() {

        driver.get(configReader.getProperty("url"));
        driver.manage().window().maximize();
        loginPage.enterUserName(configReader.getProperty("username"));
        loginPage.enterPassWord(configReader.getProperty("password"));
        loginPage.clickLogin();
        myac.clickOrders();
        myac.goToShop();
        sp.clickAndroid();
        ap.openAndroidBook();
        abp.addToCart();
        atbp.viewBasket();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        vbp.checkOut();
        cop.enterDetails();
        js.executeScript("document.getElementById('place_order').scrollIntoView();");
        cop.placeOrder();
    }


}


