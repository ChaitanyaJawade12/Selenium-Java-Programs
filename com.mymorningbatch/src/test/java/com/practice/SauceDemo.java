package com.practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws Exception {

		//Chrome Set Path
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Website URL
		driver.get("https://www.saucedemo.com/");

		//Maximize Window
		driver.manage().window().maximize();

		//Print Title Of The Page
		String title = driver.getTitle();

		System.out.println("Title :- " + title);

		//Print URL Of The Page
		System.out.println("URL :- " + driver.getCurrentUrl());

		//List<WebElement> tag = driver.findElements(By.tagName("div"));
		//System.out.println("Tag:- " + tag);

		//Enter User Name And Password
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		//Click On login Button
		driver.findElement(By.id("login-button")).click();

		//Add First Product
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

		//Click On Shopping Basket
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

		//Click On checkout Button
		driver.findElement(By.id("checkout")).click();

		//Filling Information
		driver.findElement(By.id("first-name")).sendKeys("Amay");
		driver.findElement(By.id("last-name")).sendKeys("Wagh");
		driver.findElement(By.id("postal-code")).sendKeys("442006");

		//Click On Continue
		driver.findElement(By.name("continue")).click();

		//Click On Finish
		driver.findElement(By.id("finish")).click();

		//Click On Back To Product List
		driver.findElement(By.id("back-to-products")).click();

		//Click On Side Menu
		driver.findElement(By.id("react-burger-menu-btn")).click();

		//Click On Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

		//Close The Browser
		Thread.sleep(2000);
		driver.close();

	}

}
