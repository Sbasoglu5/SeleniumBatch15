package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(dD);
        select.selectByValue("New Jersey");
        select.selectByVisibleText("Ohio");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //when it comes to multiselect we can also use deselect option as well won't work with single select
        select.deselectByValue("New Jersey");
        select.deselectByVisibleText("Ohio");
        //select.deselectByValue("Ohio"); doesn't have to be used same method what it was selected by

        System.out.println("The dropdown multiple: "+select.isMultiple());

    }
}
