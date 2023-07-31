package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlecheckBox extends BaseClass{

	public static void main(String[] args) {
		BrowserLaunch();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		List<WebElement> SelectDays = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		//Selecting all check boxes
		
		for(int i=0; i<SelectDays.size();i++)
		{
			SelectDays.get(i).click();
		}
		
		//Selecting specific check box by choice
		for (  WebElement chkbox : SelectDays) 
		{
			String checkboxname = chkbox.getAttribute("id");
			if(checkboxname.equals("tuesday") || checkboxname.equals("saturday"))
			{
				chkbox.click();
			}
		}
		//Select last 2 check boxes
		int totalcheckboxes= SelectDays.size();
		for(int i=totalcheckboxes-2; i<totalcheckboxes; i++)
		{
			SelectDays.get(i).click();
		}
		//Select first 3 check boxes
		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<3)
			{
				SelectDays.get(i).click();
			}
		}

	}

}
