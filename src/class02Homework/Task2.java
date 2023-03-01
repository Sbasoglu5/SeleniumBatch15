package class02Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John123");
        driver.findElement(By.name("lastname")).sendKeys("Terry123");
        driver.findElement(By.name("reg_email__")).sendKeys("j.terry4569@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("j.terry4569@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("th.123456789*^");
        driver.findElement(By.name("websubmit")).click();
        //driver.close();
    }
}
