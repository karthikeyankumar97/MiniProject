package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		
		String a = driver.getTitle();
		System.out.println(a);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String b = driver.getTitle();
		System.out.println(b);
		
		String c = driver.getCurrentUrl();
		System.out.println(c);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	     
		driver.close();
		driver.quit();
		
		
	}

}
