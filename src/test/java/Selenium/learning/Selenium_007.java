package Selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class Selenium_007 {
    @Test
    public void TTA_Bank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Sign-up
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
        Thread.sleep(2000);

        //Login for sign-up page
        driver.findElement(By.xpath("//input[@placeholder=\"John Doe\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@placeholder=\"you@example.com\"]")).sendKeys("janya98@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='••••••••']"))).sendKeys("1234");

        wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Create Account']")))
                .click();
        Assert.assertTrue(driver.getPageSource().contains("Dashboard"));

        //Dashboard
        boolean dashboard_display = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Dashboard\"]")))
                .isDisplayed();
        System.out.println("Displayed");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Transfer Funds\"]")))
                .click();
        Assert.assertTrue(driver.getPageSource().contains("Transfer Funds"));

        //Amount transfer
        driver.findElement(By.xpath("//input[@placeholder=\"0.00\"]")).sendKeys("5000");
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Continue\"]")))
               .click();

        //Confirm transaction

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Confirm Transfer\"]")))
                .click();

        // Back to Dashboard
        wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Dashboard']")))
                .click();

        System.out.println("Navigated back to Dashboard successfully");

        driver.quit();










    }
}
