package part1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class SecondSeleniumTest {
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        // Создаем объект ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Устанавливаем директорию для загрузки файлов
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", "C:\\Users\\v.buter\\Desktop\\DrivenBrands\\Driven_Auto\\downloads\\"); // Укажите путь к нужной директории

        // Применяем настройки
        options.setExperimentalOption("prefs", prefs);


        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit - неявное

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void browserNavigation() {
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        int width = 600;
        int height = 400;
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);
    }

    @Test
    public void browserWaiting() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));  //implicit - general wait time for all elements in the script. It automatically waits for elements to appear before throwing a NoSuchElementException. However, it can lead to longer test execution times if overused.

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2)); //explicit - Ideal for scenarios where you need to wait for specific conditions for individual elements, like visibility, clickability, or presence. This gives you more control and is more efficient for specific cases than implicit waits.
        WebElement username = driver.findElement(By.name("username"));
        wait.until(d -> username.isDisplayed());

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

        WebElement element1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("123")));

        Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));

        WebElement element3 = new FluentWait<>(driver)  // Fluent - You can set custom polling intervals and specify which exceptions to ignore during the wait. This is useful for dynamic pages where elements may appear and disappear frequently.
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")));

    }

    @AfterTest
    public void tearDown() {
        driver.close(); // driver.close() closes only the current window on which Selenium is running automated tests. The WebDriver session, however, remains active.
        driver.quit(); // On the other hand, the driver.quit() method closes all browser windows and ends the WebDriver session.
    }
}
