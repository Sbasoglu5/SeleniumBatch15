package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //click ont the radio button
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

        //check if the radio is displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        //check if radio button is selected

        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedMale);

        //if the radio button is not selected click on it
        if (!isSelectedMale) {
            maleBtn.click();
        }

        //check if the radio button is selected or not
        isSelectedMale=maleBtn.isSelected(); // important! if we don't rewrite it will print out the previous result which is false
        System.out.println("the status of selection is "+isSelectedMale);



    }
}
