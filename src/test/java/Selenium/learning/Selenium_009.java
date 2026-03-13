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

public class Selenium_009 {
    @Test
            public void Tools_WebTable(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Locate Cierra
        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//td[text()='Cierra']/following-sibling::td//span[contains(@id,'edit')]")));

        System.out.println(name.getText());

        //Delete

        WebElement DeleteRecord = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//span[@id='delete-record-3']")));
        DeleteRecord.click();

        // Click Edit button
        WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@id='edit-record-1']")));

        edit.click();

        //Edit First_Name
        WebElement editname = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='firstName']")));
        editname.clear();
        editname.sendKeys("Janya");

        //Edit Last_Name
        WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='lastName']")));
        lastname.clear();
        lastname.sendKeys("MS");

        //Edit userEmail
        WebElement userEmail = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='userEmail']")));
        userEmail.clear();
        userEmail.sendKeys("Jany@gmail.com");

        //Edit Age
        WebElement Age = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='age']")));
        Age.clear();
        Age.sendKeys("16");

        //Submit
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[@id='submit']")));
        submit.click();

        //AddName
        WebElement NewRecord = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[@id='addNewRecordButton']")));
        NewRecord.click();

        //Registration form
        WebElement FirstName1 = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='firstName']")));
        FirstName1.sendKeys("Suhas");

        WebElement LastName1 = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='lastName']")));
        LastName1.sendKeys("K");

        WebElement userEmail1 = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='userEmail']")));
        userEmail1.sendKeys("Suhas@gmail.com");

        WebElement Age1 = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='age']")));
        Age1.sendKeys("18");

        WebElement salary = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='salary']")));
        salary.sendKeys("30000");

        WebElement department = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[@id='department']")));
        department.sendKeys("Engineer");

        //Submit
        WebElement submit1 = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[@id='submit']")));
        submit1.click();



    }



}
