package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        find(locator).clear(); //очищаем
        find(locator).sendKeys(text);//вводим значение в поле
        find(locator).sendKeys(text + Keys.ENTER); // вводим значение и нажимаем кнопку с клавиатуры
    }

    protected void click(By locator) {
        find(locator).click();
    }
}
