package com.practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		//Set Chrome Path
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Get Google URL
//		driver.get("https://www.saucedemo.com/"); //For Dropdown/Select Command
//		driver.get("https://www.apple.com"); //For Scrolling 
		driver.get("https://www.tesla.com/"); //For Taking Screenshots
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Login Credentials
//		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
//		username.sendKeys("standard_user");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("secret_sauce");
//		
//		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
//		login.click();
		
		//Dropdown Select Command
//		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
//		Select dp = new Select(dropdown);
		
		//Thread.sleep(3000);
//		dp.selectByIndex(1);
//		dp.selectByValue("za");
//		dp.selectByVisibleText("Name (Z to A)");
		
		//Apple Homepage
//		WebElement Apple_Store = driver.findElement(By.xpath("//a[@aria-label='Store']//span[@class='globalnav-link-text-container']"));
//		Thread.sleep(3000);
//		Apple_Store.click();
		
		//For Scrolling
//		WebElement HomePod = driver.findElement(By.xpath("//span[normalize-space()='HomePod - Midnight']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView();", HomePod);
//		
//		HomePod.click();
		
		//Change HomePod Color
//		WebElement color = driver.findElement(By.xpath("//img[@alt='White']")); 
//		color.click();
	
		//Scroll Into Check_availability
		Thread.sleep(3000);
//		WebElement Check_availability = driver.findElement(By.xpath("//div[@class='rc-summary']"));
//		js.executeScript("arguments[0].scrollIntoView();", Check_availability);
//		
		//Click On Add_To_Bag 
//		WebElement Add_To_Bag = driver.findElement(By.xpath("//button[@title='Add to Bag']"));
//		Add_To_Bag.click();
	
		//Click On Review Bag
//		WebElement Review_Bag = driver.findElement(By.xpath("//button[@title='Review Bag']"));
//		Review_Bag.click();
		
		//Click On Check Out
//		WebElement Check_Out = driver.findElement(By.xpath("//button[@id='shoppingCart.actions.navCheckout']"));
//		Check_Out.click();
		
		//For Taking Screenshots
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".\\screenshots\\TeslaHome.png");
		FileHandler.copy(src, tar);
		
		//Click On Demo Drive
		WebElement Demo_Drive = driver.findElement(By.xpath("//section[@class='tcl-homepage-hero tcl-homepage-hero--overlay']//div[contains(@class,'tcl-homepage-hero__buttons tcl-homepage-hero__buttons-on-desktop')]//span[contains(text(),'Demo Drive')]"));
		Demo_Drive.click();
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File tar1 = new File(".\\screenshots\\DemoDrive.png");
		FileHandler.copy(src1, tar1);
		
		//Close Browser
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
	
		
		

		
		
		
		
		
		
		
		
		
			
	}

}
