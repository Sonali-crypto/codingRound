package locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageElements {
	WebDriver driverHomepage;
	public HomePageElements(WebDriver driverHomepage) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driverHomepage, 30), this);
		this.driverHomepage=driverHomepage;
	}
	
	//Fligt Booking Elements
	@FindBy(id = "OneWay")
	public WebElement oneWay;
	
	
	@FindBy(id ="FromTag")
	public WebElement fromPlace;
	
	
	@FindBy(xpath="//*[@id='ui-id-1']/li")
	public List<WebElement> originOptionslist;
	
	@FindBy(xpath ="//*[@id='ToTag']")
	public WebElement toPlace;
	
	@FindBy(xpath="//*[@id='ui-id-2']/li")
	public List<WebElement> destinationOptionslist;
	
	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[4]/a")
	public WebElement date;
	
	@FindBy(id ="SearchBtn")
	public WebElement SearchBtn;
	
	@FindBy(className ="searchSummary")
	public WebElement searchSummary;
	
	@FindBy(xpath ="//*[@id='DepartDate']")
	public WebElement departDate;
	
	
	//Hotel Booking Elements
	

    @FindBy(linkText = "Hotels")
    public WebElement hotelLink;

    @FindBy(id = "Tags")
    public WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    public WebElement searchButton;
    

    @FindBy(id = "travellersOnhome")
    public WebElement travellerSelection;
    
    @FindBy(xpath="//*[@id='ui-id-1']/li[2]/a")
	public List<WebElement> localitySuggestions;
    
    @FindBy(xpath="//input[@id='CheckInDate']")
   	public WebElement checkinDateCalendar;
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[5]/a")
   	public WebElement checkinDate;
    
    @FindBy(xpath="//input[@id='CheckOutDate']")
   	public WebElement checkoutDateCalendar;
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[4]/a")
   	public WebElement checkoutDate;
    
    //Sign In elements
    @FindBy(linkText = "Your trips")
    public WebElement yourTrips;
    
    @FindBy(id = "SignIn")
    public WebElement signIn;
    
    @FindBy(xpath = "//*[@id='modal_window']")
    public WebElement signInFrame;
  
    @FindBy(id = "signInButton")
    public WebElement signInButton;
    
    @FindBy(id = "errors1")
    public WebElement errors;
    

	
	
	
	
}
