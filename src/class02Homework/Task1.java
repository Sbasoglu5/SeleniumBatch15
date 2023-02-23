package class02Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Tom");
        driver.findElement(By.id("customer.lastName")).sendKeys("Hanks");
        driver.findElement(By.id("customer.address.street")).sendKeys("20w 34th street");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10001");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(212) 736-3100");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.name("customer.username")).sendKeys("THanks");
        driver.findElement(By.id("customer.password")).sendKeys("123456789");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
