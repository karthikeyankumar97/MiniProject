package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath1 {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/myntra-fashion-store?f=Brand%3AJack%20%26%20Jones%3A%3AGender%3Amen%2Cmen%20women&rf=Discount%20Range%3A50.0_100.0_50.0%20TO%20100.0");
		driver.manage().window().maximize();
		List<Integer> pricelist = new ArrayList<Integer>();
		List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
		for (WebElement prices : allprices) {
		 String text = prices.getText().replace("Rs. ", "");
		 System.out.println(text);
		 int value = Integer.parseInt(text);
		 System.out.println(value);
		 pricelist.add(value);
		}
		 System.out.println("Maximum_Price:"+ Collections.max(pricelist));
		 System.out.println("Minimum_Price:"+Collections.min(pricelist));
		 
		 
		}
		
			
		}


