package com.nttdata.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;

public class CartStepsDef {
    private CartPage cartPage = new CartPage();

    @Then("valido en el popup la confirmación del producto agregado")
    public void validateProductAdded() {
        Assert.assertTrue(cartPage.isProductAdded());
    }

    @Then("valido en el popup que el monto total sea calculado correctamente")
    public void validateTotalPrice() {
        Assert.assertTrue(cartPage.validateTotalPrice());
    }

    @When("finalizo la compra")
    public void proceedToCheckout() {
        cartPage.proceedToCheckout();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validateCartPage() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @Then("vuelvo a validar el calculo de precios en el carrito")
    public void revalidateCartTotal() {
        Assert.assertTrue(cartPage.validateCartPriceAgain());
    }
}
