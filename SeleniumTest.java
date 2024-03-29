package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dharm\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver. manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000); 
		driver.navigate().forward();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		}

}
