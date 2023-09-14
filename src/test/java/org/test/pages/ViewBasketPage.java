package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewBasketPage {
    WebDriver driver;
    public ViewBasketPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void checkOut()
    {
        driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
    }
}
