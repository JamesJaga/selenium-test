package com.facebook_test.facebook_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * facebook test
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        
        System.out.println("Selenium test scripts execution started");
        
        //open the browser and hit the url
        driver.get("http://www.facebook.com/login/");
        
        
        //enter the login details
        driver.findElement(By.id("email")).sendKeys("sharmajaganathan25@gmail.com");
        driver.findElement(By.id("password")).sendKeys("sharma@123");
        driver.findElement(By.id("loginbutton")).click();
        
        
        Thread.sleep(5000);
        
        driver.quit();
        
        System.out.println("Scripted executed sucessfully");
        
        
    }
}
