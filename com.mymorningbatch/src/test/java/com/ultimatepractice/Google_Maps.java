package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Maps {

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

			if(Search.equals("Pine Bush, NY, 12566")) {
				Thread.sleep(3000);
				Search.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());


	}

}
