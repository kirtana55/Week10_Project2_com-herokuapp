package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Firefox";

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
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

        //Type the username to Username field element
        driver.findElement(By.name("password")).sendKeys("SuperSecret");

        // Close the Browser
        //  driver.close();

    }
    
}

