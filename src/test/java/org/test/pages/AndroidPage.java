package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidPage {
    WebDriver driver;
    public AndroidPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void openAndroidBook()
    {
        driver.findElement(By.xpath("//h3[text()='Android Quick Start Guide']")).click();
    }

}
