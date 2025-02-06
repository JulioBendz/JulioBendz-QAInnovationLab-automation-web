package com.nttdata.page;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {
    private WebDriver driver;

    public StorePage() {
        this.driver = DriverManager.getDriver();
    }

    public void goToCategory(String category) {
        driver.findElement(By.linkText(category)).click();
    }

    public void goToSubcategory(String subcategory) {
        driver.findElement(By.linkText(subcategory)).click();
    }

    public void searchCategory(String category) {
        driver.findElement(By.id("search_query_top")).sendKeys(category);
        driver.findElement(By.name("submit_search")).click();
    }

    public boolean isNoResultsMessageDisplayed() {
        return driver.findElement(By.className("alert-warning")).isDisplayed();
    }
}
