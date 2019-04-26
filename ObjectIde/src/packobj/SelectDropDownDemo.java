package packobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		String tData="New York";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Revathi\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		Select fPort=new Select(driver.findElement(By.name("fromPort")));
		
		fPort.selectByValue(tData);
		
		System.out.println("Selected Value: "+fPort.getFirstSelectedOption().getText());
		
		List<WebElement> ports=fPort.getOptions();
		
		for(int i = 0; i<ports.size();i++)
		{
			System.out.println(ports.get(i).getText());
		}
		Thread.sleep(3000);
		driver.close();
	}

}
