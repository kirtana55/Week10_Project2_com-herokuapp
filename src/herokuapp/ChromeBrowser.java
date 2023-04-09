package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into Browser
        driver.get(baseUrl);

        //Get the Title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Email field element
       driver.findElement(By.id("username")).sendKeys("tomsmith");

        //Type the usename to Username field element
        driver.findElement(By.name("password")).sendKeys("SuperSecret");

        // Close the Browser
        //  driver.close();

    }
}
