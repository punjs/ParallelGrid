package com.ParallelGrid.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
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

public class TestCaseC {

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
				//capabilities = DesiredCapabilities.edge();
				//capabilities.setBrowserName("MicrosoftEdge");
				//capabilities.setPlatform(Platform.WIN10);
				//DesiredCapabilities capabilities = DesiredCapabilities.edge();
				//capabilities.setBrowserName("MicrosoftEdge");
				//capabilities.setPlatform(Platform.WIN10);
				//capabilities.setPlatform(Platform.WIN10);
				//capabilities.setBrowserName(BrowserType.EDGE);
				//capabilities.setVersion("17.17134");
				
				
				EdgeOptions options = new EdgeOptions();
			
			options.setCapability(CapabilityType.BROWSER_NAME, "Edge");
			options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
			//capabilities = DesiredCapabilities.chrome();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
				
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
			
		}
		
		@Test(priority=1)
	   public void FirstTc()
	{
		System.out.println("First Tc of TestCaseC");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http:\\rediffmail.com");
	}
	
	
	@Test(priority=2)
	public void SecondTc()
	{
		System.out.println("Second Tc of TestCaseC");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://ebay.com/");
	}
	
	@Test(priority=3)
	public void ThirdTc()
	{
		System.out.println("Third Tc of TestCaseC");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://seek.com/");
	}
	
	@AfterClass
    public void teardown()
    {
    	driver.quit();
    }

	
	
}
