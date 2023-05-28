package com.mymorningbatch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonHPScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver1.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\HomePage.png");
		FileHandler.copy(source, target);
		
		
		
		

	}

}
