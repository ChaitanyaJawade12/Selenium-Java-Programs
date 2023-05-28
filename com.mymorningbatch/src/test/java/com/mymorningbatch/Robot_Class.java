package com.mymorningbatch;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.Alert;

public class Robot_Class {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();

		// Click a button that triggers an alert
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		Thread.sleep(3000);
		button.click();

		// Switch the focus of the WebDriver to the alert
		org.openqa.selenium.Alert alert = driver.switchTo().alert();

		// Use Robot class to capture screenshot of the alert
//		try {
		    Robot robot = new Robot();
		    Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		    BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
		    File outputfile = new File(".\\screenshots\\Robot.png");
		    ImageIO.write(bufferedImage, "png", outputfile);
//		} catch (AWTException | IOException e) {
//		    e.printStackTrace();
//		}
	}

}
