package com.Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClickActions extends BaseClass {

	public static void main(String[] args) {
		
		BrowserLaunch();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	    
	    WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
	    
	    Actions ac = new Actions(driver);
	    ac.contextClick(button).perform();
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File trg = new File(".\\Screenshots\\homepage.png");
	    
	    
	}

}
