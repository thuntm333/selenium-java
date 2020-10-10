package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    void tc01() {
        Login loginPage = new Login(driver);
        loginPage.fillFormLogin("tomsmith", "SuperSecretPassword!");
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }
}
