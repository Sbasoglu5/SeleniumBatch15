package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //send in the username
        driver.findElement(By.id("email")).sendKeys("sezarbasoglu@gmail.com");
        //send password
        driver.findElement(By.name("pass")).sendKeys("Sb070241");
        //click on the button create new account
        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();
        Thread.sleep(2000);
        driver.close();


    }
}
