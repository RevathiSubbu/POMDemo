package pageFactoryDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingTickets {
	WebDriver driver;
	
	public BookingTickets(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='tripType' and @value='oneway']")
	WebElement tripType;
	
	@FindBy(name="tripType")
	List<WebElement> tripTypes;
	
	
	public Logout demoBookingTickets()
	{
		tripType.click();
		return PageFactory.initElements(driver, Logout.class);
	}
	
	public Logout demoBookingTickets1(String strTripType)
	{
		for(WebElement trip:tripTypes)
		{
			if(trip.getAttribute("value").equals(strTripType))
			{
				trip.click();
			}
		}
		return PageFactory.initElements(driver, Logout.class);
	}
	
	

}
