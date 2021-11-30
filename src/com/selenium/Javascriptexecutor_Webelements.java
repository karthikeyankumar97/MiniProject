package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor_Webelements {
		public static void main(String[] args)     {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//                       SENDKEYS
			WebElement email = driver.findElement(By.id("email"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('email').value='abc123@gmail.com';");
			WebElement password = driver.findElement(By.id("pass"));
			js.executeScript("document.getElementById('pass').setAttribute('value','12364525123');");
			//                            CLICK
			WebElement button = driver.findElement(By.xpath("//button[text()='Log In']"));
			js.executeScript("arguments[0].click();",button);

}
	}
