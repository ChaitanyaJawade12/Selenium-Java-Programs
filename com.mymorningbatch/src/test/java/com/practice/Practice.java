package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("chromedriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/automation");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		WebElement icon = driver.findElement(By.xpath("//img[@class='wp-image-216051 entered lazyloaded']"));
		icon.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("Free Courses");
		search.sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
