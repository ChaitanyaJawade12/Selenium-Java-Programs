package com.ultimatepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_Display {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		//Link
		System.out.println("For Link :- ");
		WebElement Link = driver.findElement(By.xpath("//a[normalize-space()='This is a link']"));
		System.out.println("This link is displayes :- " + Link.isDisplayed());
		System.out.println("This link is Enabled :- " + Link.isEnabled());
		System.out.println("This link is Selected :- " + Link.isSelected());
		
		System.out.println("------------------------------------------------");
		//TextBox
		System.out.println("TextBox :- ");
		WebElement TextBox  = driver.findElement(By.xpath("//input[@id='fname']"));
		System.out.println("This TextBox is displayes :- " + TextBox.isDisplayed());
		System.out.println("This TextBox is Enabled :- " + TextBox.isEnabled());
		System.out.println("This TextBox is Selected :- " + TextBox.isSelected());
		
		System.out.println("------------------------------------------------");
		//Click Button
		System.out.println("ClickButton :- ");
		WebElement Click_Button  = driver.findElement(By.xpath("//button[@id='idOfButton']"));
		System.out.println("This Click_Button is displayes :- " + Click_Button.isDisplayed());
		System.out.println("This Click_Button is Enabled :- " + Click_Button.isEnabled());
		System.out.println("This Click_Button is Selected :- " + Click_Button.isSelected());
		
		System.out.println("------------------------------------------------");
		//Double Click Button
		System.out.println("Double Click Button :- ");
		WebElement Double_Click_Button  = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		System.out.println("This Double_Click_Button is displayes :- " + Double_Click_Button.isDisplayed());
		System.out.println("This Double_Click_Button is Enabled :- " + Double_Click_Button.isEnabled());
		System.out.println("This Double_Click_Button is Selected :- " + Double_Click_Button.isSelected());
		
		System.out.println("------------------------------------------------");
		//Male Radio Button
		System.out.println("Male Radio Button :- ");
		WebElement Male_Radio_Button  = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("This Male Radio Button is displayes :- " + Male_Radio_Button.isDisplayed());
		System.out.println("This Male Radio Button is Enabled :- " + Male_Radio_Button.isEnabled());
		System.out.println("This Male Radio Button is Selected :- " + Male_Radio_Button.isSelected());
		
		System.out.println("------------------------------------------------");
		//Checkbox 
		System.out.println("Checkbox :- ");
		WebElement Checkbox  = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("This Checkbox is displayes :- " + Checkbox.isDisplayed());
		System.out.println("This Checkbox is Enabled :- " + Checkbox.isEnabled());
		System.out.println("This Checkbox is Selected :- " + Checkbox.isSelected());
		
		System.out.println("------------------------------------------------");
		//Drop down  
		System.out.println("Dropdown Box :- ");
		WebElement Dropdown_Box = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		System.out.println("This Dropdown Box is displayes :- " + Dropdown_Box.isDisplayed());
		System.out.println("This Dropdown Box is Enabled :- " + Dropdown_Box.isEnabled());
		System.out.println("This Dropdown Box is Selected :- " + Dropdown_Box.isSelected());
		
		System.out.println("------------------------------------------------");
		//Drop down Automation Testing 
		System.out.println("Automation Testing :- ");
		WebElement Automation_Testing  = driver.findElement(By.id("automation"));
		System.out.println("This Automation Testing is displayes :- " + Automation_Testing.isDisplayed());
		System.out.println("This Automation Testing is Enabled :- " + Automation_Testing.isEnabled());
		System.out.println("This Automation Testing is Selected :- " + Automation_Testing.isSelected());
		
		System.out.println("------------------------------------------------");
		//Drop down Performance Testing 
		System.out.println("Performance Testing :- ");
		WebElement Performance_Testing  = driver.findElement(By.id("performance"));
		System.out.println("This Performance Testing is displayes :- " + Performance_Testing .isDisplayed());
		System.out.println("This Performance Testing is Enabled :- " + Performance_Testing .isEnabled());
		System.out.println("This Performance Testing is Selected :- " + Performance_Testing .isSelected());
		
		System.out.println("------------------------------------------------");
		//Alert Box
		System.out.println("Alert Box :- ");
		WebElement Alert_Box = driver.findElement(By.xpath("//button[@onclick='generateAlertBox()']"));
		System.out.println("This Alert Box is displayes :- " + Alert_Box.isDisplayed());
		System.out.println("This Alert Box is Enabled :- " + Alert_Box.isEnabled());
		System.out.println("This Alert Box  is Selected :- " + Alert_Box.isSelected());
		
		System.out.println("------------------------------------------------");
		//Confirm Box
		System.out.println("Confirm Box :- ");
		WebElement Confirm_Box  = driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
		System.out.println("This Confirm Box is displayes :- " + Confirm_Box.isDisplayed());
		System.out.println("This Confirm Box is Enabled :- " + Confirm_Box.isEnabled());
		System.out.println("This Confirm Box is Selected :- " + Confirm_Box.isSelected());
		
		
		

		
		
	}

}
