package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),
                "Products page is not displayed");
    }

    @Test
    public void testScrollingToElement() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.scrollToAddToCartButtonWithJavascript();
    }
}
