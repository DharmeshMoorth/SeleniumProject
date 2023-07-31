package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	    public static void BrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dharm\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		

	}

}
