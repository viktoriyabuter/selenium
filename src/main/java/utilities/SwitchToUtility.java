package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;

import java.util.Set;

import static com.saucedemo.pages.BasePage.driver;

public class SwitchToUtility extends Utilities {
    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void  acceptAlert() {
        switchTo().alert().accept();
    }

    public static void  dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlert() {
        switchTo().alert().sendKeys("text");
    }

    public static void switchToFrameString(String frame) {
        switchTo().frame(frame);
    }

    public static void switchToDefaultPage() {
        switchTo().defaultContent();
    }

    public static void switchToFrameIndex(int frameIndex) throws InterruptedException {
        Thread.sleep(2000);
        switchTo().frame(frameIndex);
    }

    public static void switchToFrameWebElement(WebElement element) throws InterruptedException {
        Thread.sleep(2000);
        switchTo().frame(element);
    }

    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }

    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public static Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public static String getAttribute(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public static String getURL() {
        return driver.getCurrentUrl();
    }
}
