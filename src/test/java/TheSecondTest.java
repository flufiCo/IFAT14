import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.time.Duration;

public class TheSecondTest extends BaseTest {

    @Test
    public void zipCode4DigitsCheck() {
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.id("user-name")).sendKeys("standard_user");
        browser.findElement(By.id("password")).sendKeys("secret_sauce1");
        browser.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        String errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".error-message-container.error"))).getText();

        assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void zipCode5DigitsCheck() {
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("user-name")).sendKeys("standard_user");
        browser.findElement(By.id("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        boolean isPresent = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[text()='Sauce Labs Backpack']"))).isDisplayed();

        assertTrue(isPresent, "Sauce Labs Backpack button not found!");
    }


