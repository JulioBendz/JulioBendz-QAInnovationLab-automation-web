package com.nttdata.steps;

import pages.CartPage;

public class CartSteps {
    private CartPage cartPage = new CartPage();

    public boolean isProductAdded() {
        return cartPage.isProductAdded();
    }

    public boolean validateTotalPrice() {
        return cartPage.validateTotalPrice();
    }

    public void proceedToCheckout() {
        cartPage.proceedToCheckout();
    }

    public boolean isCartPageDisplayed() {
        return cartPage.isCartPageDisplayed();
    }

    public boolean validateCartPriceAgain() {
        return cartPage.validateCartPriceAgain();
    }
}
