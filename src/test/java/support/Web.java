package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

        //Begin of Headless execution
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver browser = new ChromeDriver(options);
        //End of Headless execution

        //Begin of Head execution
        //WebDriver browser = new ChromeDriver();
        //End of Head execution

        browser.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        browser.get("https://www.cp.pt/passageiros/pt");
        return browser;
    }
}
