package login;

import dota2.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginUp extends WebDriverSettings {

    @Test
    public void signUp() {
        LoginPage signUpPage = PageFactory.initElements(driver, LoginPage.class);
        signUpPage.open();
        signUpPage.getStarted();

        driver.findElement(By.id("login_credential")).sendKeys("121awqasda@gmail.com");
        driver.findElement(By.id("login_password")).sendKeys("qwerty123");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("hello-text")));
    }
}
