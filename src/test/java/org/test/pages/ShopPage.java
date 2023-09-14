package org.test.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class ShopPage {
    private WebDriver driver;
    public ShopPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickAndroid()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Android")).click();
    }

}
