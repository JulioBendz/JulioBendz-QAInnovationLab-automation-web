package com.nttdata.steps;

import pages.StorePage;

public class StoreSteps {
    private StorePage storePage = new StorePage();

    public void navigateToCategory(String category, String subcategory) {
        storePage.goToCategory(category);
        storePage.goToSubcategory(subcategory);
    }

    public void searchInvalidCategory(String category) {
        storePage.searchCategory(category);
    }

    public boolean isNoResultsMessageDisplayed() {
        return storePage.isNoResultsMessageDisplayed();
    }
}
