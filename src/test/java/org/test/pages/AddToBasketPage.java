package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasketPage {
    WebDriver driver;
    public AddToBasketPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void viewBasket()
    {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a")).click();
    }
}
