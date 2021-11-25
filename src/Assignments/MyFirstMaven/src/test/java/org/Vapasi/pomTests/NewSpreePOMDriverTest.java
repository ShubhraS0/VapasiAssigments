package org.Vapasi.pomTests;

import org.Vapasi.BaseTest;
import org.Vapasi.pom.CartPage;
import org.Vapasi.pom.HomePage;
import org.Vapasi.pom.LoginPage;
import org.Vapasi.pom.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewSpreePOMDriverTest extends BaseTest {

        @Test
        public void validateCartAmount() {
            LoginPage lp = new LoginPage();
            lp.login(driver, "Shubh@12.com", "Pass@123");
            HomePage hp = new HomePage();
            hp.Search(driver, "taxon", "Spree");
            ProductPage pp = new ProductPage();
            pp.addToCart(driver, "span[title='Spree Jr. Spaghetti']", "4");
            CartPage cartPage = new CartPage();
            Assert.assertEquals(cartPage.getCartValue(driver), "$1,471.26");
        }

    }



