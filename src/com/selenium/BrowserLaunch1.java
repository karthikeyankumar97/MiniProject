package com.selenium;

import org.openqa.selenium.WebDriver;

public class BrowserLaunch1  extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) {
    
		driver=getBrowser();
		launchURL("https://www.facebook.com/");
		getTitle();
		getcurrenturl();
		navigateTo("https://www.instagram.com/");
		navigateBack();
		navigateForward();
		navigateRefresh();
		close();
		quit();
		
	}

}
