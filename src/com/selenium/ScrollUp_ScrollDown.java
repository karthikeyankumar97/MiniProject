package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDown {
	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//                        *********VERTICAL SCROLL UP SCROLL DOWN*************
		WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", logo);
		Thread.sleep(2000);
		WebElement UP = driver.findElement(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[4]"));
		js.executeScript("arguments[0].scrollIntoView();", UP);
}
    }


