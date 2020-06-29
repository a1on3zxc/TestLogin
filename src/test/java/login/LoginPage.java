package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(className = "login")
    private WebElement header;

    private By signUpButton = By.className("site-login");

    public void open() {
        driver.get("https://dota2.ru/");
    }

    public void getStarted() {
        header.findElement(signUpButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginForm")));


    }
}
