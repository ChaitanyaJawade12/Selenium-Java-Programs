package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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

		//Code for licking on dropdoun field
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select dp = new Select(dropdown);

		Thread.sleep(4000);
		//For (A to Z)
				dp.selectByVisibleText("Name (A to Z)");
		//		dp.selectByValue("az");
		//		dp.selectByIndex(0);

		//For (Z to A)
		//		dp.selectByVisibleText("Name (Z to A)");
		//		dp.selectByValue("za");
		//		dp.selectByIndex(1);

		//For Price (low to high)
		//		dp.selectByVisibleText("Price (low to high)");
		//		dp.selectByValue("lohi");
		//		dp.selectByIndex(2);

		//For Price (low to high)
		//		dp.selectByVisibleText("Price (high to low)");
		//		dp.selectByValue("hilo");
		//		dp.selectByIndex(3);

	}

}
