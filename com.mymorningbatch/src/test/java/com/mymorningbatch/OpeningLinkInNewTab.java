package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLinkInNewTab {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		String newtab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).sendKeys(newtab);
		
		

	}

}
