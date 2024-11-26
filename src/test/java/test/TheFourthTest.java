package test;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TheFourthTest extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed());
        assertEquals(driver.findElement(By.xpath("//*[text()='Products']")).getText(), "Products");
    }


}



