package com.nttdata.steps;

import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    public void login(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    public boolean isLoginErrorDisplayed() {
        return loginPage.isLoginErrorDisplayed();
    }
}
