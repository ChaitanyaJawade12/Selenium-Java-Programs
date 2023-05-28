package com.mymorningbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Alerts {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.edge.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		//Handling Click For JS Alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Handling Click For JS Confirm
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();
		
		//Handling Click For JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("This message is displayed on alert :- " + prompt.getText());
		Thread.sleep(3000);
		prompt.sendKeys("Welcome");
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println("Result :- " + result.getText());
		
		
		
		
		
	}

}
