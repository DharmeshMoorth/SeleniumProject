package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseOverAction extends BaseClass{

	public static void main(String[] args)throws InterruptedException {
		BrowserLaunch();
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
		Thread.sleep(4000);
		
		WebElement out = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement signout = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(out).moveToElement(signout).click().perform();
		

	}

}
