package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//             ***********SINGLE FRAME****************
		WebElement singleframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleframe);
		WebElement input = driver.findElement(By.xpath("//input[@type='text'][1]"));
		input.sendKeys("Single frame");
		//           **************** MULTIPLE FRAMES**************
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		button.click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		WebElement input1 = driver.findElement(By.xpath("//input[@type='text']"));
		input1.sendKeys("Multipleframes");
		

}
   }

