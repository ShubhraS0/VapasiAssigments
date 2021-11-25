package org.Vapasi.pom;

import org.Vapasi.factory.LoginFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginFactory {
//    public void login(WebDriver driver, String username, String password) {
//        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
//        driver.findElement(By.id("spree_user_email")).sendKeys(username);
//        driver.findElement(By.name("spree_user[password]")).sendKeys(password);
//        driver.findElement(By.cssSelector("input[value='Login']")).click();
//
//        System.out.println("Login Successful ");
//    }

    public void login(WebDriver driver, String email, String password) {
        PageFactory.initElements(driver, this);
        login.click();
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        loginButton.click();
    }
}
