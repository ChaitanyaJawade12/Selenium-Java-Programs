package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Messsage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement age = driver.findElement(By.xpath("//input[@id=\"age\"]"));
		String agetooltipmsg = age.getAttribute("title");
		System.out.println("This is title of the age box : - " + agetooltipmsg); 
		
		
		
	}

}
