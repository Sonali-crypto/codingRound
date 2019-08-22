import com.sun.javafx.PlatformUtil;

import commonlogic.GenericMethods;
import locators.HomePageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelBookingTest extends GenericMethods {

    WebDriver driver=null;


    @Test
    public void shouldBeAbleToSearchForHotels() {
    	
        driver=openHomepage();
        
        waitFor(2000);
        HomePageElements element=new HomePageElements(driver);


        element.hotelLink.click();

        element.localityTextBox.sendKeys("Indiranagar, Bangalore");

        waitFor(2000);

        List<WebElement> localitySuggestions = element.localitySuggestions;
        System.out.println(localitySuggestions.get(0).getText());
        localitySuggestions.get(0).click();
        
        element.checkinDateCalendar.click();
        
        element.checkinDate.click();
        
        element.checkoutDateCalendar.click();
        
        element.checkoutDate.click();
        
        new Select(element.travellerSelection).selectByVisibleText("1 room, 2 adults");
        
        element.searchButton.click();
        
        waitFor(5000);

        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(element.searchSummary));
        driver.quit();

    }


}
