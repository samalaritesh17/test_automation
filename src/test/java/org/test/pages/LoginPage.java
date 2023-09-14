package org.example;
import java.time.Duration;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private static final String  USERNAME= "username";
    private static final String PASSWORD = "password";
    private static final String LOGIN = "login";
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String username) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public void enterPassWord(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(By.name(LOGIN)).click();
    }











}

