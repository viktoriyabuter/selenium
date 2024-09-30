package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    @Description("sample test4")
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),
                "Products page is not displayed");
    }

    @Test
    @Description("sample test5")
    public void testScrollingToElement() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.scrollToAddToCartButtonWithJavascript();
    }
}
