package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidBookPage {
    WebDriver driver;
    public AndroidBookPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addToCart()
    {
        driver.findElement(By.xpath("//*[@id=\"product-169\"]/div[2]/form/button")).click();
    }
}
