package com.nttdata.stepsdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.StorePage;
import org.junit.Assert;

public class StoreStepsDef {
    private StorePage storePage = new StorePage();

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navigateToCategory(String category, String subcategory) {
        storePage.goToCategory(category);
        storePage.goToSubcategory(subcategory);
    }

    @When("navego a la categoria {string}")
    public void navigateToInvalidCategory(String category) {
        storePage.searchCategory(category);
    }

    @Then("valido que el sistema no encuentra resultados")
    public void validateNoResults() {
        Assert.assertTrue(storePage.isNoResultsMessageDisplayed());
    }
}
