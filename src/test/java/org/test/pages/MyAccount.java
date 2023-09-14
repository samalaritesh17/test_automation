package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
    private WebDriver driver;
    public MyAccount(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOrders()
    {
        driver.findElement(By.linkText("Orders")).click();
    }
    public void goToShop()
    {
        driver.get("https://practice.automationtesting.in/shop/");
    }
}
