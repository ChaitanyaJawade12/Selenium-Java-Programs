package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tesla.com/");
		
		driver.manage().window().maximize();
		
		String newtab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@title=\"Model S\"]")).sendKeys(newtab);
	    
	
	    
		
	}

}
