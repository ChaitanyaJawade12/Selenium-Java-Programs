package com.mymorningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIdisplay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		//For Displayed
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("The searchbar is getting displayed :- " + searchbar.isDisplayed()); //return type is allways true or false
		
		//For Clickable
		System.out.println("The searchbar is clickable :- " + searchbar.isEnabled());  //Clickable
		
		//For Selected
		WebElement footer = driver.findElement(By.xpath("//span[@class='footer-disclaimer']"));
		System.out.println("The footer is clickable :- " + footer.isSelected());
		
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Gender is by default selected :- " + radiobutton.isSelected());
		
		
		
		
		
	}

}
