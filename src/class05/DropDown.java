package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        //use select class because this drop down has a select tag
        Select select=new Select(dropDown);

        //select by index
        select.selectByIndex(2);
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }


        //select by the value
        select.selectByValue("Tuesday");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }


        //select by visible text
        select.selectByVisibleText("Friday");
    }
}
