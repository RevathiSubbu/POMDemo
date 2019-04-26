package packobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptionBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		String tData="oneway";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Revathi\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		List<WebElement> tTypes=driver.findElements(By.name("tripType"));
		System.out.println(tTypes.size());
		Thread.sleep(3000);
		for(int i=0;i<tTypes.size();i++)
		{
			//System.out.println(tTypes.get(i).getAttribute("value"));
			if(tTypes.get(i).getAttribute("value").equals(tData))
			{
				tTypes.get(i).click();
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
