package pageFactoryDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	@FindBy(linkText="SIGN-OFF")
	WebElement signOff;
	
	public void demoSignOff()
	{
		signOff.click();
	}

}
