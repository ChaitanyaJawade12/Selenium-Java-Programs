package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleToolTips {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver2.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/"); //This cmd is used for launching the webpage

		//Maximize Window
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); //Driver switches the execution within iframe
		
		WebElement box = driver.findElement(By.xpath("//input[@id='age']"));
		
		String tooltipmsg = box.getAttribute("title");
		
		System.out.println("This is tooltip message :- " + tooltipmsg);
		 
		

	}

}
