package Selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Selenium_004 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.splitnsettle.app/");
        driver.manage().window().maximize();

       // using link text - Always preffered linktext only
        driver.findElement(By.linkText("Features")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Blog")).click();
        Thread.sleep(5000);

       /*
       usig partialLinktext (not recommended suppose if we hve 2 links with same text
        "Smart add" is the linktext but ive given only the partial text
        i.e Smart still it working.?
        */

        driver.findElement(By.partialLinkText("Smart")).click();


        /*
        Listings all tag names <a>, all the links will be listed, which are available in
        webpage.
        */

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total number of links:" + links.size());
        Thread.sleep(5000);

        //listing all the images from the webside

        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println("Total number of image:" + image.size());

        driver.quit();







    }
}

