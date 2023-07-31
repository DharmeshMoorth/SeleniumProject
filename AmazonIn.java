package com.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dharm\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		Email.sendKeys("dharmesh0695@gmail.com");
		Thread.sleep(2000);
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		Password.sendKeys("Bhachu@2928");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		login.click();
		Thread.sleep(2000);
		WebElement Search = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		Search.sendKeys("Iphone 14");
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Submit.click();
		Thread.sleep(2000);
		WebElement Product = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		Product.click();
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent WindowID:"+ parentWindowID);
		System.out.println("Child WindowID:"+ childWindowID);
		
		driver.switchTo().window(childWindowID);
	  
		WebElement buyNow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buyNow.click();
		Thread.sleep(2000);
		WebElement payment = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		payment.click();
		
		driver.switchTo().window(parentWindowID);
		driver.close();
	
		
		
		}

}
