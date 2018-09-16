package com.ParallelGrid.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RandomTest {
@Test
public void test123() throws MalformedURLException
{
	WebDriver driver;
	System.setProperty("webdriver.edge.driver", "C:\\Web_Drivers\\MicrosoftWebDriver.exe");
	//DesiredCapabilities capabilities = DesiredCapabilities.edge();
	//@SuppressWarnings("deprecation")
	
	DesiredCapabilities capabilities =null;
	capabilities = DesiredCapabilities.edge();
	//capabilities.setBrowserName("Edge");
	//capabilities.setPlatform(Platform.WIN10);		
	//EdgeOptions options =new EdgeOptions();
	//options.setCapability(CapabilityType.BROWSER_NAME, "Edge");
	//options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

	
	
	//driver.get("http://google.com");
	}
}

