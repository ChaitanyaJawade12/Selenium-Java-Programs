package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Location_Grubhub {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.grubhub.com/");

		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Enter street address or zip code']"));
		Search.clear();
		Thread.sleep(3000);
		Search.sendKeys("Pune");
		
		String text = null;
		do {
			Thread.sleep(3000);
			Search.sendKeys(Keys.ARROW_DOWN);
			text = Search.getAttribute("value");
			
			if(Search.equals("Puente Hills, City of Industry, CA")) {
			Thread.sleep(3000);
			Search.sendKeys(Keys.ENTER);
			break;
			}
		}while(!text.isEmpty());
		

	}

}
