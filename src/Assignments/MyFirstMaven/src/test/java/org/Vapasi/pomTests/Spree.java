//package org.Vapasi;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class Spree {
//    WebDriver driver ; //declaring
//
//        @BeforeMethod
//        public void Launch()
//        {
//            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
//            driver = new ChromeDriver();  //driver initialization
//            // launch GoogleChrome and direct it to the Spree URL
//           // driver.get("https://spree-vapasi-prod.herokuapp.com/");
//            System.out.println("Spree Launched ");
//
//        }
//
//        @Test
//        public void TestSpree() {
//
//            //Login
//            driver.get("https://spree-vapasi-prod.herokuapp.com/login");
//            driver.findElement(By.id("spree_user_email")).sendKeys("Shubh@12.com");
//            driver.findElement(By.name("spree_user[password]")).sendKeys("Pass@123");
//            driver.findElement(By.cssSelector("input[value='Login']")).click();
//
//            System.out.println( "Login Successful ");
//
//            //Search after selecting a category
//            WebElement dropDown = driver.findElement(By.id("taxon"));
//            Select value = new Select(dropDown);
//            value.selectByValue("1");
//
//            System.out.println("Category Selected ");
//
//            // by passing the text value to be searched
//            driver.findElement(By.cssSelector("[id='keywords']")).sendKeys("Spree");
//            driver.findElement(By.cssSelector("input[value='Search']")).click();
//            //driver.quit();
//
//            System.out.println("Search Successful");
//
//            // click on Spree product, give quantity & add to cart
//            driver.findElement(By.cssSelector("span[title='Spree Jr. Spaghetti']")).click();
//            driver.findElement(By.name("quantity")).clear();
//            driver.findElement(By.name("quantity")).sendKeys("4");
//            driver.findElement(By.id("add-to-cart-button")).click();
//
//            System.out.println("Add to Cart Successful");
//        }
//            @AfterMethod
//            public void Close() {
//              //  WebDriver driver = new ChromeDriver();
//                //logout
//                driver.quit();
//                System.out.println("Close Successful");
//            }
//}
//
//
//
