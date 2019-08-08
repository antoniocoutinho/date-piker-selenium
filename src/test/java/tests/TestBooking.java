package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import support.Web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import pages.Passageiros;

public class TestBooking {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();
    }
    @Test
    public void clickInitDate() throws InterruptedException {
        String tomorrow = LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("d"));
        String afterTomorrow = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("d"));

        Passageiros s = new Passageiros(browser);
        s.selectDepartureLocal("Porto - Campanha")
                .selectDepartureDay(tomorrow)
                .selectArrivalocal("Lisboa - O")
                .selectArrivalDay(afterTomorrow);
    }
    @After
    public void tearnDown(){browser.quit();}
}
