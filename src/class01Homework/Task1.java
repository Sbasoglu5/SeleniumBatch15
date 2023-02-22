package class01Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/?tag=amazusnavi-20&hvadid=589152046215&hvpos=&hvnetw=g&hvrand=8492567574862101790&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9004359&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14580410&gclid=EAIaIQobChMIsN_70aCo_QIVD1RyCh2oTAv_EAAYASAAEgLtEfD_BwE");
        String title=driver.getTitle();
        System.out.println(title);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
    }
}
