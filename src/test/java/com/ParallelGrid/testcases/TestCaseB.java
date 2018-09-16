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


public class TestCaseB {
	public WebDriver driver;	
	
	DesiredCapabilities capabilities =null;
		@Parameters ({"browser"})
		@BeforeClass
		public void setup(String browser) throws MalformedURLException
		{
			
			if(browser.equalsIgnoreCase("Edge"))
			{
			
			//EdgeOptions options = new EdgeOptions();
			//options.setCapability(CapabilityType.BROWSER_NAME, "Edge");
			//options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
			
			capabilities = DesiredCapabilities.edge();
			capabilities.setBrowserName("Edge");
			capabilities.setPlatform(Platform.WIN10);
			
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
				
			}
			
			driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), capabilities);
			
		}	
	@Test(priority=1)
	public void FirstTc()
	{
		System.out.println("First Tc of TestCaseB");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http:\\snapdeal.com");
	}
	
	
	@Test(priority=2)
	public void SecondTc()
	{
		System.out.println("Second Tc of TestCaseB");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.get("https://flipkart.com/");
		}
	}
	
	@Test(priority=3)
	public void ThirdTc()
	{
		System.out.println("Third Tc of TestCaseB");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.get("https://amazon.com/");
			
		}
	}

	@AfterClass
    public void teardown()
    {
    	driver.quit();
    }

	
	
}
