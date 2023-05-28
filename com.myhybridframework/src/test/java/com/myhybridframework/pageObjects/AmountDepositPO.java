package com.myhybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmountDepositPO {
	WebDriver ldriver;

	public AmountDepositPO(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver; //Equating driver
		PageFactory.initElements(rdriver, this);
	}
	//Find Selectors
	@FindBy(xpath="//a[normalize-space()='Deposit']") //locators and values
	WebElement deposit; //declaring varable

	@FindBy(xpath="//input[@name='accountno']") //locators and values
	WebElement accoount_no; //declaring varable

	@FindBy(xpath="//input[@name='ammount']") //locators and values
	WebElement amount; //declaring varable

	@FindBy(xpath="//input[@name='desc']") //locators and values
	WebElement description; //declaring varable
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement accsubmit;

	//Action Methods
	public void setdeposit()
	{
		deposit.click();
	}
	public void setaccoount_no(String acc_no)
	{
		accoount_no.sendKeys(acc_no);
	}
	public void setamount(String amt)
	{
		amount.sendKeys(amt);
	}
	public void setdescription(String desc)
	{
		description.sendKeys(desc);
	}
	public void setaccsubmit()
	{
		accsubmit.click();
	}



}
