package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Method1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sss@gamil.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12301230");

		//WebElement login = driver.findElement(By.name("login"));
		// login.click();

		//String text = login.getText();
		//System.out.println(text);

		//password.clear();
		//password.sendKeys("789455");
		
		String attribute = email.getAttribute("name");
		System.out.println(attribute);
		
		
	}

}
