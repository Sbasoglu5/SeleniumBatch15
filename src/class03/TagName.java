package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381813071031&hvpos=&hvnetw=g&hvrand=14910088601953653264&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9004359&hvtargid=kwd-295905205420&ref=pd_sl_4acnt2uvfi_e&hydadcr=28886_11845520&gclid=EAIaIQobChMIkomu8Ni5_QIVg4JbCh0XZgdnEAAYASAAEgL9-PD_BwE");

        //get all the links
        // we know that all links are in tag <a> which is also called anchor tag
        //let's use the locator by tagName for this purpose
        List<WebElement> tags=driver.findElements(By.tagName("a"));
        //in order to print we need the iterator
        for (WebElement tag:tags){
           String link=tag.getAttribute("href");
            System.out.println(link);
        }

    }
}
