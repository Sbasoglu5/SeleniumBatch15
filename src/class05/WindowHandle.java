package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S688558128%3A1678243059670261&Email=sezarbasoglu%40gmail.com&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHeteFa3_rpWrZDuZPhRPih5YFsL-goSm7t7zKwIkklKbuFSEaMCHZUcTNY_ZKqzAAEbreXoWQ");

        //click to help
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        //click to privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handles of all have been opened
        Set<String> windowHandles=driver.getWindowHandles();
        //print all handles
        for (String handles:windowHandles){
            System.out.println(handles);
        }
    }
}
