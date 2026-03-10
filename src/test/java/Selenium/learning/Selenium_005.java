package Selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_005 {

    @Test
    public void testExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sarasdemo.excelindia.com/K12Saras/School/Default.aspx?ReturnUrl=%2fk12saras%2fschool");
        driver.manage().window().maximize();

        // using name locator
        driver.findElement(By.name("txtEmail")).sendKeys("epst001");
        driver.findElement(By.name("txtPWD")).sendKeys("school");
        driver.findElement(By.name("txcSC")).sendKeys("epsm");

        // using ID locator
        boolean logo_displayed_status = driver.findElement(By.id("imgLogo")).isDisplayed();

        // link text and partial link text
        //<a -> anker tag, href = attribute
        driver.findElement(By.linkText("Contact Us")).click();

        driver.quit();

    }


}
