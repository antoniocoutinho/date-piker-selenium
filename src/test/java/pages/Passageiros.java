package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Passageiros {
    protected WebDriver browser;

    public Passageiros(WebDriver browser) {
        this.browser = browser;
    }

    public Passageiros selectDepartureLocal(String local) throws InterruptedException {

        WebElement ori = browser.findElement(By.name("depart"));
        ori.sendKeys(local);
        Thread.sleep(2000);
        Actions builder = new Actions(browser);
        Action enterPress = builder.sendKeys(ori, Keys.ENTER).build();
        enterPress.perform();
        return this;
    }
    public Passageiros selectArrivalocal(String local) throws InterruptedException {

        WebElement ori = browser.findElement(By.name("arrival"));
        ori.sendKeys(local);
        Thread.sleep(2000);
        Actions builder = new Actions(browser);
        Action enterPress = builder.sendKeys(ori, Keys.ENTER).build();
        enterPress.perform();
        return this;
    }

    public Passageiros selectDepartureDay(String day){
        browser.findElement(By.id("datepicker-first")).click();
        List<WebElement> dias = browser.findElements(By.cssSelector("#datepicker-first_table > tbody > tr > td"));

        for ( WebElement dia: dias){
            if(dia.getText().equals(day)){
                dia.click();
                break;
            }
        }
        return this;
    }
    public Passageiros selectArrivalDay(String day){
        browser.findElement(By.id("datepicker-second")).click();
        List<WebElement> dias = browser.findElements(By.cssSelector("#datepicker-first_table > tbody > tr > td"));

        for ( WebElement dia: dias){
            if(dia.getText().equals(day)){
                dia.click();
                break;
            }
        }
        return this;
    }
}
