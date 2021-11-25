package org.Vapasi.pomTests;

import org.Vapasi.pom.HomePage;
import org.Vapasi.pom.LoginPage;
import org.Vapasi.pom.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpreePOM {
    WebDriver driver ; //declaring
    @BeforeMethod
    public void Launch()
    {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();  //driver initialization
        // launch GoogleChrome and direct it to the Spree URL
        // driver.get("https://spree-vapasi-prod.herokuapp.com/");
        System.out.println("Spree Launched ");
    }
    @Test
    public void TestSpree() {
        LoginPage lp = new LoginPage();
        lp.login(driver, "Shubh@12.com","Pass@123");
        HomePage hp = new HomePage();
        hp.Search(driver, "taxon", "Spree");
        ProductPage pp = new ProductPage();
        pp.addToCart(driver,"span[title='Spree Jr. Spaghetti']","4");
    }
    @AfterMethod
    public void Close() {
        //WebDriver driver = new ChromeDriver();
        //logout
        driver.quit();
        System.out.println("Close Successful");
    }
}



