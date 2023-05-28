package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingURL {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/"); //This cmd is used for launching the webpage
		System.out.println("URL Of The Page :- " + driver.getCurrentUrl());

		//Maximize Window
		driver.manage().window().maximize();

		//Print Title Of The Page
		String title = driver.getTitle();

		System.out.println("Title :- " + title);

		WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));  
		password.sendKeys("secret_sauce");

		WebElement clk = driver.findElement(By.xpath("//input[@id='login-button']"));
		clk.click();

		WebElement addtocart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		addtocart.click();

		WebElement clicktobasket = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		clicktobasket.click();

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();

		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("James");

		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Roy");

		WebElement postalcode = driver.findElement(By.id("postal-code"));
		postalcode.sendKeys("442006");

		WebElement next = driver.findElement(By.name("continue"));
		next.click();

		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();

		driver.get("https://www.saucedemo.com/checkout-complete.html"); 
		System.out.println("URL Of The Page :- " + driver.getCurrentUrl());


		WebElement back = driver.findElement(By.id("back-to-products"));
		back.click();


		driver.get("https://www.saucedemo.com/inventory.html"); 
		System.out.println("URL Of The Page :- " + driver.getCurrentUrl());

	}

}
