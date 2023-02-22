package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webDriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of webDriver
        WebDriver driver=new ChromeDriver();

        //open the website google.com
        driver.get("https://www.facebook.com/");

        //get
        String URL=driver.getCurrentUrl();
        //print out url
        System.out.println(URL);

        //get the title of the webpage
        String title=driver.getTitle();
        //print the title page
        System.out.println("the title of the page is "+title);

        Thread.sleep(3000);
        //close browser

        driver.quit();
    }

}
