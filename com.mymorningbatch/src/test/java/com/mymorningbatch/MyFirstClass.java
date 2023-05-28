package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/"); //This cmd is used for launching the webpage
		
		
		driver.manage().window().maximize(); //cmd for maximize the window
		
		//Login Credentials
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		//Login Button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//Click On Side Menu
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		//Click On About option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
		
		//close The Browser
		driver.close();

	}

}
