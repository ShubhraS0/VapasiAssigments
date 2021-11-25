package org.Vapasi.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFactory {
    @FindBy(linkText = "Login")
    public WebElement login;

    @FindBy(name = "spree_user[email]")
    public WebElement emailTextBox;

    @FindBy(id = "spree_user_password")
    public WebElement passwordTextBox;

    @FindBy(css = "input[value='Login']")
    public WebElement loginButton;
}





