package com.ParallelGrid.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ddfw.punj.base;

public class TestCaseA  {
	
	public WebDriver driver;	
	
	DesiredCapabilities capabilities =null;
		@Parameters ({"browser"})
		@BeforeClass
		public void setup(String browser) throws MalformedURLException
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
			ChromeOptions options = new ChromeOptions();
			
			options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
			options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT,true);
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
				
			}
			
			
			if(browser.equalsIgnoreCase("firefox"))
			{
			FirefoxOptions options = new FirefoxOptions();
			
			options.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);	
			}
			
			if(browser.equalsIgnoreCase("Edge"))
			{
				EdgeOptions options = new EdgeOptions();
			
				//capabilities = DesiredCapabilities.edge();
				//capabilities.setBrowserName("MicrosoftEdge");
				//capabilities.setPlatform(Platform.WIN10);
				//capabilities.setPlatform(Platform.WIN10);
				//capabilities.setBrowserName(BrowserType.EDGE);
				//capabilities.setVersion("17.17134");
				
				
			options.setCapability(CapabilityType.BROWSER_NAME, "Edge");
			options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
			//capabilities = DesiredCapabilities.edge();
			//capabilities.setCapability(EdgeOptions., options);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
				
			}
			
			driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), capabilities);
			
		}
		

	
	@Test(priority=1)
	public void FirstTc() throws InterruptedException
	{
		System.out.println("First Tc of TestCaseA");
		Thread.sleep(2000);
		driver.get("http:\\rediff.com");
		
	}
	
	
	@Test(priority=2)
	public void SecondTc() throws InterruptedException
	{
		System.out.println("Second Tc of TestCaseA");
		Thread.sleep(2000);
		driver.get("https://economictimes.indiatimes.com/");
	}
	
	@Test(priority=3)
	public void ThirdTc() throws InterruptedException
	{
		System.out.println("Third Tc of TestCaseA");
		Thread.sleep(2000);
		
		driver.get("https://google.com/");
	}

	@AfterClass
    public void teardown()
    {
    	driver.quit();
    }
}
	

