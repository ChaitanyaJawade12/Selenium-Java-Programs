package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvalidLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
//
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("james");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("taylor");

//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//Fetch And Print Username
		WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		System.out.println("This is username:- " + username);
		
		////Fetch And Print Password
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));  
		password.sendKeys("secret_sauce");
		System.out.println("This is password:- " + password);

		//Click On Login Button
		WebElement clk = driver.findElement(By.xpath("//input[@id='login-button']"));
		clk.click();
		
		//Print The CurrentURL
		System.out.println("This is current URL:- " + driver.getCurrentUrl());
		
		


	}

}
