package com.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dynamic_Xpath {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/television-store?otracker=nmenu_sub_TVs%20and%20Appliances_0_Televisions&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Television");
		driver.manage().window().maximize();
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_3I9_wc']/preceding-sibling::div"));
		for (WebElement Allprices: price) {
			String text = Allprices.getText().replaceAll("?", " ");
			System.out.println(text);
		}
			
		}

}
