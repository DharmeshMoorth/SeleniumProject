package com.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits extends BaseClass {
	    public static void main(String[] args) {
	    BrowserLaunch();
	    driver.get("https://www.trivago.in/en-IN");
	    driver.manage().window().maximize();
	    
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement Favoites = driver.findElement(By.xpath("//span[text()='Favorites']"));
	    //Favoites.click();
		
	    //Explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(Favoites));
	    Favoites.click();
	    
		
	}

}

