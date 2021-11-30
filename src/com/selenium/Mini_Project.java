package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		WebElement Tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		act.click(Tshirt).build().perform();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", name);
		Thread.sleep(2000);
		WebElement colour = driver.findElement(By.id("color_2"));
		act.doubleClick(colour).build().perform();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		act.click(cart).build().perform();
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
		act.click(btn).build().perform();
		Thread.sleep(3000);
		WebElement btn1 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/p[2]/a/span"));
		act.click(btn1).build().perform();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthikn8785@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Karthikeyan@97");
		WebElement signin = driver.findElement(By.xpath("//div[@id='center_column']/div/div[2]/form/div/p[2]/button/span"));
		act.click(signin).build().perform();
		Thread.sleep(2000);
		WebElement btn2 = driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
		act.click(btn2).build().perform();
		Thread.sleep(2000);
		WebElement Agree = driver.findElement(By.id("uniform-cgv"));
		act.click(Agree).build().perform();
		WebElement btn3 = driver.findElement(By.xpath("//form[@id='form']/p/button/span"));
		act.click(btn3).build().perform();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Screenshot/picture.png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
