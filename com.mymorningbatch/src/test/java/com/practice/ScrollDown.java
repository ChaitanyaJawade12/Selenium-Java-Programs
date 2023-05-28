package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement Apple_Mackbook = driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Apple_Mackbook );
		Apple_Mackbook.click();
		
		System.out.println("This is current URl:- " + driver.getCurrentUrl());
		WebElement order = driver.findElement(By.xpath("//a[normalize-space()='Orders']"));
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",order );
		order.click();
		
		WebElement register = driver.findElement(By.xpath("//button[normalize-space()='Register']"));
		register.click();
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		radio.click();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='FirstName']"));
		first_name.sendKeys("Rohit");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@id='LastName']"));
		last_name.sendKeys("Sharma");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		day.sendKeys("4");
	
		WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		month.sendKeys("6");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		year.sendKeys("2000");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("rahul.sharma01@gmail.com");
			
		WebElement company_name = driver.findElement(By.xpath("//input[@id='Company']"));
		company_name.sendKeys("nopcommerce");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("Abcd@12345");
		
		WebElement Confirm_password  = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		Confirm_password.sendKeys("Abcd@12345");
		
		WebElement Register_Button  = driver.findElement(By.xpath("//button[@id='register-button']"));
		Register_Button.click();
			
		
		
		
		

	}

}
