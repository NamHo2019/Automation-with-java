package vn.kms.course.selenium.tests.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vn.kms.course.selenium.bases.BaseTest;
import vn.kms.course.selenium.demo.AccessoriesPage;
import vn.kms.course.selenium.demo.CartCheckOutPage;
import vn.kms.course.selenium.demo.GroceriesPage;
import java.net.MalformedURLException;

public class DemoAddToCart extends BaseTest {
    WebDriver driver;
    AccessoriesPage accessoriesPage;
    GroceriesPage groceriesPage;
    CartCheckOutPage addCartPage;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        driver = new ChromeDriver();
        DemoAddToCart demoAddToCart = new DemoAddToCart();
        demoAddToCart.signInForUiTest(driver);
        accessoriesPage = new AccessoriesPage(driver);
        groceriesPage = new GroceriesPage(driver);
        addCartPage = new CartCheckOutPage(driver);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void AddProductToCartSuccessfully() throws InterruptedException {
        accessoriesPage.OpenPage();
        accessoriesPage.SelectARandomProduct();
        groceriesPage.OpenPage();
        groceriesPage.SelectARandomProduct();
        addCartPage.OpenPage();
        addCartPage.setListOfProduct();
    }
}
