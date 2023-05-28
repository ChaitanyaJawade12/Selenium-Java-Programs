package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		WebElement pharmacy = driver.findElement(By.xpath("//span[normalize-space()='Pharmacy Simplified']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",pharmacy );
		pharmacy.click();
		
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		
		

	}

}
