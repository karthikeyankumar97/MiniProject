package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("xyz");
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("123123123");
	    TakesScreenshot ts = (TakesScreenshot) driver ;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Screenshot/picture.png");
	    FileUtils.copyFile(src, dest);
	}

}

