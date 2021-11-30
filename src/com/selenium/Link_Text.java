package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		button.click();
		//                       LINKTEXT
		WebElement facebook = driver.findElement(By.linkText("Facebook"));
		facebook.click();
		//                   
		PARTIALLINKTEXT
		WebElement youtube = driver.findElement(By.partialLinkText("You"));
		youtube.click();

}
}
