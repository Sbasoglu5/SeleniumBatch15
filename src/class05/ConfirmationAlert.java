package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();



        //use switchTo
        Alert alert=driver.switchTo().alert();
        alert.accept();


        //prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        alert.sendKeys("qwerty");
        Thread.sleep(2000);
        alert.accept();



    }
}
