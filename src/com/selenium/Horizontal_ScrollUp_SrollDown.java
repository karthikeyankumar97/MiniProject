package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_ScrollUp_SrollDown {
	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		//             **********HORIZONTAL SCROLL UP SCROLL DOWN-LEFT TO RIGHT*************
		WebElement left_to_right = driver.findElement(By.id("a22"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", left_to_right);
		Thread.sleep(2000);
		//             *********RIGHT TO LEFT************
		WebElement right_to_left = driver.findElement(By.id("a1"));
		js.executeScript("arguments[0].scrollIntoView();", right_to_left);

}
     }
