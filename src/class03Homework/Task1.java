package class03Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement userName =driver.findElement(By.xpath("//input[@id='user-message']"));
        userName.sendKeys("I am writing here thru Selenium");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement userValue=driver.findElement(By.xpath("//input[@placeholder='Enter value']"));
        userValue.sendKeys("28");
        WebElement userValue2= driver.findElement(By.xpath("//input[@id='sum2']"));
        userValue2.sendKeys("2");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        List<WebElement> total= driver.findElements(By.xpath("//button[text()='Get Total']"));
        for (WebElement t:total){
            String sum=t.getAttribute("type");
            System.out.println(sum);
        }





    }
}
