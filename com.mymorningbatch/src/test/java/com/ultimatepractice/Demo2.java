package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		String register = Keys.chord(Keys.CONTROL,Keys.RETURN);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='ico-register']")).sendKeys(register);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/p[4]/a[1]")).sendKeys(register);
		
		
		
		
		
		
		
		
	}

}
