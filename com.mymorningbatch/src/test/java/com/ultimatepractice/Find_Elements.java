package com.ultimatepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='src']"));


		searchbox.sendKeys("Mumbai");


		Thread.sleep(3000);


		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@classs=\"autoFill homeSearch\"]/li")); //Find manually xpath of UL tag


		String clickitem1 = "Thane West, Mumbai";


		Thread.sleep(3000);


		//Dynamic Handling Of Autosuggestions


		for(WebElement suggestion1 : suggestions ) {


			if(suggestion1.getText().contains(clickitem1)) {


				Thread.sleep(3000);


				suggestion1.click();


				break;


			}


		}

		 
	}

}
