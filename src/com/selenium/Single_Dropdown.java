package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//select by value
			WebElement day = driver.findElement(By.id("day"));
			Select s = new Select(day);
			s.selectByValue("4");
			//                IS MULTIPLE
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
			//select by visible text 
			WebElement month = driver.findElement(By.id("month"));
			Select s1 = new Select(month);
			s1.selectByVisibleText("Jan");
			//select by value
			WebElement year = driver.findElement(By.id("year"));
			Select s2 = new Select(year);
			s2.selectByValue("2018");
	}

}

