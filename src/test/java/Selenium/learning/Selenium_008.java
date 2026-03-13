package Selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_008 {
    @Test
    public void Orange_HRM() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(2000);
        //Login page
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"))
                .sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"))
                .sendKeys("Hacker@4321");
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[normalize-space() = \"Login\"]"))).click();

        //PIM
        String Terminated = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//div[contains(text(),\"Terminated\")]")))
                .getText();
        System.out.println("Terminated");

      //Bin
        WebElement binIcon = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector(".oxd-icon-button.oxd-table-cell-action-space")));

        System.out.println(binIcon.isDisplayed());

        // Click delete button
        WebElement deleteButton = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//i[contains(@class,'bi-trash')]/parent::button")));

        deleteButton.click();

        driver.quit();









    }
}
