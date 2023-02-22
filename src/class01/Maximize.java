package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        // connect to the browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://google.com/");
        //maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
