package com.ultimatepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");;
		
		driver.manage().window().maximize();
		
		WebElement From_Send = driver.findElement(By.xpath("//input[@id='src']"));
		From_Send.sendKeys("Mumbai");
		
		List<WebElement> From = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]"));
		String clickitem1 = "Thane West, Mumbai";
		
		Thread.sleep(3000);
		
		//Dynamic Handling Of Autosuggestions

				for(WebElement From1 : From ) {

					if(From1.getText().contains(clickitem1)) {

						Thread.sleep(3000);

						From1.click();

						break;

					}
				}
		
	}

}
