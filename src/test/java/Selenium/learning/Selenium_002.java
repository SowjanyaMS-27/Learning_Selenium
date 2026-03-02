package Selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_002 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sarasdemo.excelindia.com/K12Saras/School/Default.aspx?ReturnUrl=%2fk12saras%2fschool");
        driver.manage().window().maximize();

    }
}
