package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.xpath("//*[@id='login_button_container']//h3");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password)  {
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public String getUsernameFieldAttribute() {
        return find(usernameField).getAttribute("id");
    }

    public void scrollIntoViewWithJavascript(WebElement locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView()", locator);
    }

//    JavaScriptExecutor:
//    Манипуляция элементами: Позволяет напрямую взаимодействовать с DOM-элементами, если WebDriver не может корректно их обнаружить или взаимодействовать с ними.
//    Прокрутка страницы: прокрутить страницу до определённого элемента или позиции
//    Извлечение данных: Можно получить данные из страницы, которые иначе недоступны через стандартные методы.
//    Выполнение сложных операций: Иногда требуется выполнение JavaScript-функций, которые сложно реализовать через WebDriver (например, обработка асинхронных операций или управление событиями).
}
