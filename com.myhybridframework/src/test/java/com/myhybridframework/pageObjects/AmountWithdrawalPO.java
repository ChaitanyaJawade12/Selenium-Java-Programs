package com.myhybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmountWithdrawalPO {

	WebDriver ldriver;

	public AmountWithdrawalPO(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver; //Equating driver
		PageFactory.initElements(rdriver, this);
	}
	//Find Selectors
	@FindBy(xpath="//a[normalize-space()='Withdrawal']") //locators and values
	WebElement withdrawal; //declaring varable

	@FindBy(xpath="//input[@name='accountno']") //locators and values
	WebElement accoount_no1; //declaring varable

	@FindBy(xpath="//input[@name='ammount']") //locators and values
	WebElement amount1; //declaring varable

	@FindBy(xpath="//input[@name='desc']") //locators and values
	WebElement description1; //declaring varable
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement accsubmit1;

	//Action Methods
	public void setwithdrawal()
	{
		withdrawal.click();
	}
	public void setaccoount_no1(String acc_no)
	{
		accoount_no1.sendKeys(acc_no);
	}
	public void setamount1(String amt)
	{
		amount1.sendKeys(amt);
	}
	public void setdescription1(String desc)
	{
		description1.sendKeys(desc);
	}
	public void setaccsubmit1()
	{
		accsubmit1.click();
	}



}


