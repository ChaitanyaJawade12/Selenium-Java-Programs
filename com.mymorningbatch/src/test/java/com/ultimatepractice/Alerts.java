package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.Alert;

public class Alerts {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		//Click For JS Alert
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		WebElement Alert = driver.findElement(By.xpath("//p[@id='result']"));
//		System.out.println("This is the result of the Alert button :- " + Alert.getText());

		//Click For JS Confirm
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		WebElement Alert = driver.findElement(By.xpath("//p[@id='result']"));
//		System.out.println("This is the result of the Alert button :- " + Alert.getText());
		
		//Click For JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		org.openqa.selenium.Alert prompt = driver.switchTo().alert();
		System.out.println("This message is displayed on alert :- " + prompt.getText());
		Thread.sleep(3000);
		prompt.sendKeys("Welcome");
		driver.switchTo().alert().accept();
		





	}

}
