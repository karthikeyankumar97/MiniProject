package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	public static   WebDriver getBrowser() {		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");	
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 return driver;
}
	public static void launchURL(String url) {
		driver.get(url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack() {
		driver.navigate().back();

	}
	public static void navigateForward() {
		driver.navigate().forward();

	}
	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	
		
	}
