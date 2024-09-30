package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ProductsPage extends BasePage {
       private final By ProductsHeader = By.xpath("//*[text()='Products']");
       private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

       public boolean isProductsHeaderDisplayed() {
          return find(ProductsHeader).isDisplayed();
       }

        public void scrollToAddToCartButtonWithJavascript() {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView();", driver.findElement(addToCartButton));
        }
}