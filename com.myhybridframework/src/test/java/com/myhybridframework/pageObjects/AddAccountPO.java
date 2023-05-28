package com.myhybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPO {
WebDriver ldriver;
	
	public AddAccountPO(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver; //Equating driver
		PageFactory.initElements(rdriver, this);
	}
	
	//Find Selectors
	@FindBy(xpath="//a[normalize-space()='New Account']") //locators and values
	WebElement new_account; //declaring varable
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customer_id;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement initial_deposit;
	
	@FindBy(xpath="//input[@name='button2']")
	WebElement submit2;
	
	//Action Methods
			public void setnew_account()
			{
				new_account.click();
			}
			public void setcustomer_id(String custid)
			{
				customer_id.sendKeys(custid);
			}
			public void setinitial_deposit(String initial_dp)
			{
				initial_deposit.sendKeys(initial_dp);
			}
			public void setsubmit2()
			{
				submit2.click();
			}

	
	

	

}
