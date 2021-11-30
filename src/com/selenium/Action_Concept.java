package com.selenium;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concept {
	public static void main(String[] args) throws AWTException    {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/fashion-big-diwali-sale-trendy-2021-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_ca2e1be8-890b-499d-b24f-8a5597b3b541_1_792OEL9WB5K2_MC.NYEMHX57LP8R&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion_NYEMHX57LP8R&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=NYEMHX57LP8R");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mens = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[3]"));
		Actions act = new Actions(driver);
		//                            MOVE TO ELEMENT
		act.moveToElement(mens).build().perform();
		//                            CLICK
		WebElement TShirts = driver.findElement(By.linkText("T-Shirts"));
		//act.click(TShirts).build().perform();
		//                            CONTEXT CLICK(Right Click)
		act.contextClick(TShirts).build().perform();
		 //                           ROBOT--------->Class
		Robot r = new Robot();
	
	
		
		
	
		
		
		
	}

}
