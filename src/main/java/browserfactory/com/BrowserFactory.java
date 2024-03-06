package browserfactory.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.com.ConfigReader;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static WebDriver getBrowser(String BrowserName, String appURL)
	{
	
		if(BrowserName.equalsIgnoreCase("Chrome")||BrowserName.equalsIgnoreCase("chrome"))
		{
			
			driver=new ChromeDriver();	
		}
		if(BrowserName.equalsIgnoreCase("Firefox")||BrowserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(BrowserName.equalsIgnoreCase("Edge")||BrowserName.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();
		}
		driver.get(appURL);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperties("pageLoadTimeout"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperties("scriptLoadTimeout"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperties("Implicitlywait"))));
		return driver;

	}
		
	
}
