package com.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dharm\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		Email.sendKeys("dharmesh.m__");
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		Password.sendKeys("Bhachu 2928");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Login = driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
		Login.click();
		Thread.sleep(3000);
		WebElement Save = driver.findElement(By.xpath("//div[text()='Not Now']"));
		Save.click();
		Thread.sleep(3000);
		WebElement popUp = driver.findElement(By.xpath("//button[text()='Not Now']"));
		popUp.click();
		Thread.sleep(3000);
		WebElement Messages = driver.findElement(By.xpath("//span[text()='Messages']"));
		Messages.click();
		Thread.sleep(3000);
		WebElement Renks = driver.findElement(By.xpath("//span[text()='அகமும் ♥️ நானும்']"));
		Renks.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Message = driver.findElement(By.xpath("//div[@aria-describedby='Message']"));
		Message.sendKeys("Dinning hall vaa da");
		Thread.sleep(3000);
		WebElement Send = driver.findElement(By.xpath("//div[text()='Send']"));
		Send.click();
	
	}

}
