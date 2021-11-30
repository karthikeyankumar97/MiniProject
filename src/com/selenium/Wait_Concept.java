package com.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait_Concept {
	
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// implicitly wait
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.accept();
		//until.dismiss();
		wait.until(ExpectedConditions.visibilityOf(email));
		wait.until(ExpectedConditions.invisibilityOf(email));
		//Fluent Wait
		Wait wait = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(null)
	
		

}
}
