package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DApple&otracker=clp_metro_expandable_6_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_92RED14GXPXF_wp3&fm=neo%2Fmerchandising&iid=M_709387ca-846d-420d-995f-2c496fb24f74_3.92RED14GXPXF&ppt=hp&ppn=homepage&ssid=nfi7nrp1tc0000001635252384168");
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div/div/div/img"));
		img.click();
		
		
	}

}
