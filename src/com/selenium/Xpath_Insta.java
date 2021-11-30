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

public class Xpath_Insta {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		email.sendKeys("aaa@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("1234567990");
	   WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
	   login.click();
	   TakesScreenshot ts = (TakesScreenshot) driver ;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Screenshot/image.png");
	    FileUtils.copyFile(src, dest);
	   
	  

}
}
