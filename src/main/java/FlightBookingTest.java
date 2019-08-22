import commonlogic.GenericMethods;
import locators.HomePageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
 

import java.util.List;

public class FlightBookingTest extends GenericMethods {

	
    WebDriver driver=null;


    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        //Open Home Page
        driver=openHomepage();
        
        waitFor(2000);
        HomePageElements element=new HomePageElements(driver);
        element.oneWay.click();

        element.fromPlace.clear();
        element.fromPlace.sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin

        waitFor(2000);
        
        List<WebElement> originOptions = element.originOptionslist;
        originOptions.get(0).click();

        element.toPlace.clear();
        element.toPlace.sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        waitFor(2000);
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = element.destinationOptionslist;
        destinationOptions.get(0).click();

        //element.departDate.click();
        element.date.click();

        //all fields filled in. Now click on search
        element.SearchBtn.click();

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(element.searchSummary));

        //close the browser
        driver.quit();

    }


    

    

    
}
