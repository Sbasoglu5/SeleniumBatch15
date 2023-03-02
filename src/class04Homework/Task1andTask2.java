package class04Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Task1andTask2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement check=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean radioCheck= check.isSelected();
        System.out.println(radioCheck);

        if (!radioCheck){
            check.click();
        }
        radioCheck=check.isSelected();
        System.out.println(radioCheck);


        List<WebElement> list=driver.findElements(By.xpath("//input[contains(@class,'element')]"));
        for (WebElement checkList:list){
            String allOptions=checkList.getAttribute("value");
            if (allOptions.equalsIgnoreCase("Option-1")){
                checkList.click();
            }
        }
    }
}
