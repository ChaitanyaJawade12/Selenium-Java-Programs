package com.ultimatepractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		System.out.println("This is the login page URl :- " + driver.getCurrentUrl());

		//Screenshot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".\\SS\\One.png");
		FileHandler.copy(src, tar);

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.submit();

		System.out.println("This is product page URL :- " + driver.getCurrentUrl());

		//Selecting
	//	WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
//
//		Select sc = new Select(dropdown);
//		Thread.sleep(3000);
//		sc.selectByIndex(1);
//		sc.selectByValue("za");
//		sc.selectByVisibleText("Name (Z to A)");

		//Screenshot
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File tar1 = new File(".\\SS\\Two.png");
		FileHandler.copy(src1, tar1);
		
		//Scrolling
		WebElement T_Shirt_Red = driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", T_Shirt_Red);
		Thread.sleep(3000);
		T_Shirt_Red.click();
		
		Thread.sleep(3000);
		WebElement back_to_product = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		back_to_product.click();
		
		//Open New Tab
		
		String newtab1 = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).sendKeys(newtab1);
		
		
		
	}

}
