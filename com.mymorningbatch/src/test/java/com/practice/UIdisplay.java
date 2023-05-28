package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIdisplay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window

		//For Displayed
		System.out.println("For Display");
		//Link
		WebElement Link  = driver.findElement(By.xpath("//a[normalize-space()='This is a link']"));
		System.out.println("The link is getting displayed :- " + Link.isDisplayed());

		//TextBox 
		WebElement TextBox  = driver.findElement(By.xpath("//input[@id='fname']"));
		System.out.println("The textbox is getting displayed :- " + TextBox.isDisplayed());

		//Submit Button
		WebElement submit_button = driver.findElement(By.xpath("//button[@id='idOfButton']"));
		System.out.println("The submit button is getting displayed :- " + submit_button.isDisplayed());

		//Double Click Button
		WebElement Double_Click_Button = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		System.out.println("The Double Click Button is getting displayed :- " + Double_Click_Button.isDisplayed());

		//Radio button
		WebElement Radio_Button = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("The Radio Button is getting displayed :- " + Radio_Button.isDisplayed());

		//Checkbox 
		WebElement Checkbox = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("The Checkbox is getting displayed :- " + Checkbox.isDisplayed());

		//Drop Down
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		System.out.println("The Automaton Testing is getting displayed :- " + drop_down.isDisplayed());

		// Button To Generate Alert Box
		WebElement Generate_Alert_Box = driver.findElement(By.xpath("//button[@onclick='generateAlertBox()']"));
		System.out.println("The Button To Generate Alert Box is getting displayed :- " + Generate_Alert_Box.isDisplayed());

		//Button To Generate Confirm Box
		WebElement Generate_Confirm_Box = driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
		System.out.println("The Button To Generate Confirm Box is getting displayed :- " + Generate_Confirm_Box.isDisplayed());

		System.out.println("------------------------------------------------------------------------------------------------------");
		//For Enabled
		System.out.println("For Enabled");

		//link1
		WebElement Link1  = driver.findElement(By.xpath("//a[normalize-space()='This is a link']"));
		System.out.println("The link is clickable :- " + Link1.isEnabled());

		//TextBox1 
		WebElement TextBox1 = driver.findElement(By.xpath("//input[@id='fname']"));
		System.out.println("The textbox is clickable :- " + TextBox1.isEnabled());

		//Submit Button1
		WebElement submit_button1 = driver.findElement(By.xpath("//button[@id='idOfButton']"));
		System.out.println("The submit button is clickable :- " + submit_button1.isEnabled());

		//Double Click Button
		WebElement Double_Click_Button1 = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		System.out.println("The Double Click Button is clickable :- " + Double_Click_Button1.isEnabled());

		//Radio button
		WebElement Radio_Button1 = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("The Radio Button is clickable :- " + Radio_Button1.isEnabled());

		//Checkbox 
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("The Checkbox is clickable :- " + Checkbox1.isEnabled());

		//Drop Down
		WebElement drop_down1 = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		System.out.println("The Automaton Testing is clickable :- " + drop_down1.isEnabled());

		// Button To Generate Alert Box
		WebElement Generate_Alert_Box1 = driver.findElement(By.xpath("//button[@onclick='generateAlertBox()']"));
		System.out.println("The Button To Generate Alert Box is clickable :- " + Generate_Alert_Box1.isEnabled());

		//Button To Generate Confirm Box
		WebElement Generate_Confirm_Box1 = driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
		System.out.println("The Button To Generate Confirm Box is clickable :- " + Generate_Confirm_Box1.isEnabled());

		System.out.println("------------------------------------------------------------------------------------------------------");
		//For Selected
		System.out.println("For Selected");

		//Radio button
		//Male
		WebElement Male_Button = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("The MAle Radio button is by default selected :- " + Male_Button.isSelected());

		//Female
		WebElement Female_Button = driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("The Female Radio button is by default selected :- " + Female_Button.isSelected());

		//Checkbox 
		//Automation Testing
		WebElement Automation_Testing = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("The Automation Testing checkbox is by default selected :- " + Automation_Testing.isSelected());

		//Performance Testing
		WebElement Performance_Testing = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("The Automation Testing checkbox is by default selected :- " + Performance_Testing.isSelected());

		//Drop Down
		//Automation Testing
		WebElement Automation_Testing1 = driver.findElement(By.id("automation"));
		System.out.println("The Automaton Testing is by default selected :- " + Automation_Testing1.isSelected());
		
		WebElement Performance_Testing2 = driver.findElement(By.id("performance"));
		System.out.println("The Automaton Testing is by default selected :- " + Performance_Testing2.isSelected());
		
		WebElement Manual_Testing2 = driver.findElement(By.id("manual"));
		System.out.println("The Automaton Testing is by default selected :- " + Manual_Testing2.isSelected());
		
		WebElement Database_Testing2 = driver.findElement(By.id("database"));
		System.out.println("The Automaton Testing is by default selected :- " + Database_Testing2.isSelected());

	}

}
