package hooks.com;


import org.openqa.selenium.WebDriver;

import browserfactory.com.BrowserFactory;
import dataProvider.com.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.com.Helper;

public class Hooks {
	
	public WebDriver driver;

		@Before
		public void applicationLaunch()
		{
			System.out.println("Log Info: Running before Hook Browser will start now");
			driver=BrowserFactory.getBrowser(ConfigReader.getProperties("BrowserName"), ConfigReader.getProperties("appURL"));
			System.out.println("Log Info : Browser is up and running");
		}
			
		@After
		public void close()
		{
		driver.quit();
		}
	
	@AfterStep
		public void Screenshot(Scenario scenario)
		{
			if(scenario.isFailed())
			{
				String screenshot=Helper.Screenshot(driver);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
			
		}
	
	
}
