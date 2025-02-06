package com.nttdata.stepsdefinitions;

import steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class LoginStepsDef {

    private LoginSteps loginSteps;

    public LoginStepsDef() {
        this.loginSteps = new LoginSteps();
    }

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        System.out.println("Usuario en la página de la tienda");
    }

    @When("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConUsuarioYClave(String usuario, String clave) {
        loginSteps.login(usuario, clave);
    }

    @Then("valido que el sistema muestre un mensaje de error de autenticación")
    public void validoMensajeDeError() {
        assertTrue("El mensaje de error no se mostró", loginSteps.isLoginErrorDisplayed());
    }
}
