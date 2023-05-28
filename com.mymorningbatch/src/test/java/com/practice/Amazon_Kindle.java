package com.practice;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Kindle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/"); //This cmd is used for launching the webpage

		driver.manage().window().maximize(); //cmd for maximize the window
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\HomePage1.png");
		FileHandler.copy(source, target);
		
		WebElement Kindle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[9]/div[1]/div[3]/a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Kindle );
		
		Kindle.click();
		

		Thread.sleep(3000);
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File(".\\Screenshots\\readerpage.png");
		FileHandler.copy(source1, target1);
		
		WebElement KindleKindle_Paperwhite = driver.findElement(By.xpath("//img[@alt='Kindle Paperwhite (8 GB) – Now with a 6.8\" display and adjustable warm light – Black']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",KindleKindle_Paperwhite );
		
		KindleKindle_Paperwhite.click();
		
		File source2 = ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(".\\Screenshots\\HomePage2.png");
		FileHandler.copy(source2, target2);
				
	
		
	}

}
