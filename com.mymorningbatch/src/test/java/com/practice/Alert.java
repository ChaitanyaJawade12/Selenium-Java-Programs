package com.practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alert {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		

		//Handling Click Button to see alert
	
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		org.openqa.selenium.Alert alert =  driver.switchTo().alert();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\First.png");
		FileHandler.copy(source, target);
		Thread.sleep(3000);
		alert.accept();
		
		//Handling On button click, alert will appear after 5 seconds
		
			driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
			
			org.openqa.selenium.Alert alert1 =  driver.switchTo().alert();
			Thread.sleep(5000);
			
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			File target1 = new File(".\\Screenshots\\Second.png");
			FileHandler.copy(source1, target1);
			Thread.sleep(3000);
			alert1.accept();
			
			//Handling On button click, confirm box will appear
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			org.openqa.selenium.Alert alert2 =  driver.switchTo().alert();
			Thread.sleep(3000);
			
			TakesScreenshot ts2 = (TakesScreenshot)driver;
			File source2 = ts2.getScreenshotAs(OutputType.FILE);
			File target2 = new File(".\\Screenshots\\Third.png");
			FileHandler.copy(source2, target2);
			Thread.sleep(3000);
			alert2.accept();
			alert2.dismiss();
			
			//On button click, prompt box will appear
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			org.openqa.selenium.Alert prompt = driver.switchTo().alert();
			Thread.sleep(3000);
			TakesScreenshot ts3 = (TakesScreenshot)driver;
			File source3 = ts3.getScreenshotAs(OutputType.FILE);
			File target3 = new File(".\\Screenshots\\Third.png");
			FileHandler.copy(source2, target2);
			
			prompt.sendKeys("Welcome");
			driver.switchTo().alert().accept();
			
			
		
	
	}
}

		
		
		