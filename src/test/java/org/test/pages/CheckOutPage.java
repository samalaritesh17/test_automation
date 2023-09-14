package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    WebDriver driver;
    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterDetails()
    {
        WebElement first = driver.findElement(By.id("billing_first_name"));
        first.clear();
        first.sendKeys("Samala");
        WebElement last = driver.findElement(By.id("billing_last_name"));
        last.clear();
        last.sendKeys("Ritesh dhyan");
        WebElement phone = driver.findElement(By.id("billing_phone"));
        phone.clear();
        phone.sendKeys("6302559136");
        WebElement address1 = driver.findElement(By.id("billing_address_1"));
        address1.clear();
        address1.sendKeys("Gandimaisamma");
        WebElement address2 = driver.findElement(By.id("billing_address_2"));
        address2.clear();
        address2.sendKeys("Hyderabad");
        WebElement city = driver.findElement(By.id("billing_city"));
        city.clear();
        city.sendKeys("Dundigal");
        WebElement postcode = driver.findElement(By.id("billing_postcode"));
        postcode.clear();
        postcode.sendKeys("500043");

    }

    public void placeOrder()
    {
        driver.findElement(By.id("place_order")).click();
    }

}
