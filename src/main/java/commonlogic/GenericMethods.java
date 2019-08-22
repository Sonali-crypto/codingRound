package commonlogic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class GenericMethods {
	public WebDriver driver = null;

	public WebDriver openHomepage()
	{
		setDriverPath();
		driver=new ChromeDriver();
		driver.get(Constants.siteUrl);
		return driver;

	}

	public void setDriverPath() {
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
		}
	}

	public boolean isElementPresent(WebElement element) {
		try {
			if(element.isDisplayed())
				return true;
			else
				return false;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}


}
