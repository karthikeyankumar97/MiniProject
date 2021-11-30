package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement multiselect = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
		Select s = new Select(multiselect);
		        // is multiple
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
				// getoptions
				List<WebElement> options = s.getOptions();
				for (WebElement alloptions : options) {
					String text = alloptions.getText();
					System.out.println(text);	
				}
		      //  select by index
				s.selectByIndex(0);
				s.selectByIndex(3);
				System.out.println("*********allselectedoptions**********");
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (WebElement all : allSelectedOptions) {
					String text = all.getText();
					System.out.println(text);	
				}
				System.out.println("*******firstselected option*******");
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				String text = firstSelectedOption.getText();
				System.out.println(text);
				// size 
				int size = options.size();
				System.out.println(size);
				//         DESELECT
			Thread.sleep(2000);
				WebElement visibletext = driver.findElement(By.name("multipleselect[]"));
				Select s1 = new Select(visibletext);
				s1.deselectByVisibleText("Performance Testing");
				WebElement value = driver.findElement(By.name("multipleselect[]"));
				Select s2 = new Select(value);
				s2.deselectByValue("msselenium");
				//s.deselectAll();
				
				
				
				
		

}
}
