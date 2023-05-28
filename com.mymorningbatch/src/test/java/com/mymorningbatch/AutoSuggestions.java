package com.mymorningbatch;


import java.util.List;


import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestions {


	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");


		ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.redbus.in/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window


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


		//Thread.sleep(3000);


		WebElement searchbox2 = driver.findElement(By.xpath("//input[@id='dest']"));


		searchbox2.sendKeys("Pune");


		Thread.sleep(3000);


		List<WebElement> suggestions1 = driver.findElements(By.xpath("//li[@data-id=\"89672\"]")); //Find manually xpath of UL tag


		String clickitem2 = "Wakad, Pune";


		Thread.sleep(3000);


		//Dynamic Handling Of Autosuggestions


		for(WebElement suggestion2 : suggestions1 ) {


			if(suggestion2.getText().contains(clickitem2)) {


				Thread.sleep(3000);


				suggestion2.click();


				break;


			}


		}


	}

}

