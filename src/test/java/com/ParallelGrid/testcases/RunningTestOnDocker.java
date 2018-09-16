package com.ParallelGrid.testcases;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RunningTestOnDocker {

    @Test
    public void runTestOnDocker() throws Exception {
        DesiredCapabilities dcap = DesiredCapabilities.chrome();
        //String driverPath = System.getProperty("user.dir") + "/exe/chromedriver";
        System.setProperty("webdriver.chrome.driver", "C:\\Web_Drivers");

        // You should check the Port No here.
        URL gamelan = new URL("http://localhost:32773/wd/hub");
        WebDriver driver = new RemoteWebDriver(gamelan, dcap);
        // Get URL
        driver.get("https://www.google.com/");
        
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
        // Print Title
        
        System.out.println(driver.getTitle());
    }
}