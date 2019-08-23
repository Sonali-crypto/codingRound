import commonlogic.GenericMethods;
import locators.HomePageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
 

import java.util.List;

public class FlightBookingTest extends GenericMethods {

	
    WebDriver driver=null;
    HomePageElements element=new HomePageElements(driver);


    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        //Open Home Page
        driver=openHomepage();
        
        waitFor(2000);
        
        System.out.println("Navigated to Home Page");
        
        element.oneWay.click();
        System.out.println("oneWay has been clicked");

        
        element.fromPlace.clear();
        element.fromPlace.sendKeys("Bangalore");
        


        //wait for the auto complete options to appear for the origin

        waitFor(2000);
        
        List<WebElement> originOptions = element.originOptionslist;
        originOptions.get(0).click();

        System.out.println("Source has been selected");

        element.toPlace.clear();
        element.toPlace.sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        waitFor(2000);
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = element.destinationOptionslist;
        destinationOptions.get(0).click();

        System.out.println("Destination has been selected");

        //element.departDate.click();
        element.date.click();

        System.out.println("Depart Date has been selected");

        //all fields filled in. Now click on search
        element.SearchBtn.click();

        System.out.println("Search button has been clicked");

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(element.searchSummary));
        
        System.out.println("Search Results are displayed");

        //close the browser
        driver.quit();

    }


    

    

    
}
