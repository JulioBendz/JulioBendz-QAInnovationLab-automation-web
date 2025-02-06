package com.nttdata.page;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage() {
        this.driver = DriverManager.getDriver();
    }

    public boolean isProductAdded() {
        return driver.findElement(By.id("myModalLabel")).isDisplayed();
    }

    public boolean validateTotalPrice() {
        return driver.findElement(By.cssSelector(".cart-total")).isDisplayed();
    }

    public void proceedToCheckout() {
        driver.findElement(By.cssSelector(".checkout-button")).click();
    }

    public boolean isCartPageDisplayed() {
        return driver.findElement(By.cssSelector(".page-title")).getText().equals("Carrito");
    }

    public boolean validateCartPriceAgain() {
        return driver.findElement(By.cssSelector(".cart-summary")).isDisplayed();
    }
}
