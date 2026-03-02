package Selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_001 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://school.excelpublicschool.com/LMS/LMSIndex/index.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}

