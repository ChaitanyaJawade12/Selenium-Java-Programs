package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.twoplugs.com/"); //This cmd is used for launching the webpage


//		driver.manage().window().maximize(); //cmd for maximize the window
		
		WebElement Live_Posting = driver.findElement(By.xpath("//a[normalize-space()='Live Posting']"));
		Live_Posting.click();
		
		Thread.sleep(3000);
		WebElement search_box = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		search_box.clear();
		search_box.sendKeys("Pune");
		
		Thread.sleep(3000);
		String text = null;
		
		do {
			Thread.sleep(3000);
			search_box.sendKeys(Keys.ARROW_DOWN);
			
			text = search_box.getAttribute("value");
			
			if(text.equals("Pune - Mumbai Expressway, Yamuna Kunj, Sector-10, New Panvel East, Panvel, Navi Mumbai, Maharashtra, India")) {
				
				Thread.sleep(3000);
				search_box.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());
	}

}
