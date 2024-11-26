package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_INPUT = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys("standard_user");
        driver.findElement(PASSWORD_INPUT).sendKeys("secret_sauce");
        driver.findElement(LOGIN_INPUT).submit();

    }
}
