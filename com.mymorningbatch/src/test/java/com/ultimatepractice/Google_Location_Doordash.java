package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Location_Doordash {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.dr;iver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.doordash.com/");
		
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='HomeAddressAutocomplete']"));
		Search.click();
		Search.sendKeys("Mumbai");
		
		Thread.sleep(3000);
		String text = null;
		
		do {
			Thread.sleep(3000);
			Search.sendKeys(Keys.ARROW_DOWN);
			
			text = Search.getAttribute("value");
			
			if(text.equals("Mumbai airport, Navpada, Vile Parle East, Santacruz East, Mumbai, Maharashtra, India")) {
				
				Thread.sleep(3000);
				Search.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());
		
	}

}
