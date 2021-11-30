package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		List<WebElement> all_datas = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement All_datas : all_datas) {
			String text = All_datas.getText();
			System.out.println(text);
		}
		System.out.println("************Row_Data***********");
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement rowdata : row_data) {
			String text = rowdata.getText();
			System.out.println(text);
			
		}
		System.out.println("**********Column_Data***********");
		List<WebElement> Columndata = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement Column_data : Columndata) {
			String text = Column_data.getText();
			System.out.println(text);
			
		}
		System.out.println("***********Particular_row&column**************");
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		String text = particular.getText();
		System.out.println(text);
	}
}

	     
			
			
		
		
		


 
 
