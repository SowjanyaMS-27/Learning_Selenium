package Selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_010 {
    @Test
    public void VWO_Platform(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login_page
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id=\"login-username\"]")));
        email.sendKeys("janya98@gmail.com");

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='login-password']")));
        password.sendKeys("janya");

        WebElement Sign_in = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[@id='js-login-btn']")));
        Sign_in.click();

        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='js-notification-box-msg']")));

        errorMsg.getText();
        String actualText = errorMsg.getText();

        Assert.assertTrue(actualText.contains(
                "Your email, password, IP address or location did not match"));

        driver.close();



    }

}
