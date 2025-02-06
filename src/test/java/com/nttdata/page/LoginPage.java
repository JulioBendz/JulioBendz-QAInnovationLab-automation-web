package com.nttdata.page;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }

    public void navigateToLogin() {
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("field-email")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("field-password")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.id("submit-login")).click();
    }

    public boolean isLoginErrorDisplayed() {
        return driver.findElement(By.className("alert-danger")).isDisplayed();
    }
}
