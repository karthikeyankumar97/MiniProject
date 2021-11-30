package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		                    //   SIMPLE ALERT
		WebElement button1 = driver.findElement(By.id("alertButton"));
		button1.click();
		Thread.sleep(2000);
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		//                       CONFIRM ALERT
		WebElement button2 = driver.findElement(By.id("confirmButton"));
		button2.click();
		Thread.sleep(2000);
		Alert Confirm_alert = driver.switchTo().alert();
		Confirm_alert.accept();
		//                     PROMT ALERT
		WebElement button3 = driver.findElement(By.id("promtButton"));
		button3.click();
		Thread.sleep(2000);
		Alert Promt_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = Promt_alert.getText();
		System.out.println(text);
		Promt_alert.sendKeys("Selenium");
		Promt_alert.accept();
		

}
}
