import commonlogic.GenericMethods;
import locators.HomePageElements;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends GenericMethods {

	WebDriver driver = null;

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		driver=openHomepage();

		waitFor(2000);
		HomePageElements element=new HomePageElements(driver);

		element.yourTrips.click();
		element.signIn.click();
		driver.switchTo().frame(element.signInFrame);
		element.signInButton.click();

		String errors1 = element.errors.getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
		driver.quit();
	}


}
