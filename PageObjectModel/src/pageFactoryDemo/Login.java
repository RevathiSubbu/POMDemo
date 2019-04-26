package pageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="userName")
	WebElement uName;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement login;
	
	public BookingTickets demoLogin()
	{
		uName.sendKeys("mercury");
		pwd.sendKeys("mercury");
		login.click();
		return PageFactory.initElements(driver, BookingTickets.class);
	}
	
	public Logout demoLogin1()
	{
		
		return PageFactory.initElements(driver, Logout.class);
		
	}

}
