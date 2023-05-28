package com.myhybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPO {
	
WebDriver ldriver;
	
	public AddCustomerPO(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver; //Equating driver
		PageFactory.initElements(rdriver, this);
	}
	//Find Selectors
		@FindBy(xpath="//a[normalize-space()='New Customer']") //locators and values
		WebElement new_customer; //declaring varable
		
		@FindBy(xpath="//input[@name='name']")
		WebElement customername;
		
		@FindBy(xpath="//input[@id='dob']")
		WebElement customerdd;

		@FindBy(xpath="//input[@id='dob']")
		WebElement customermm;

		@FindBy(xpath="//input[@id='dob']")
		WebElement customeryyyy;

		@FindBy(xpath="//textarea[@name='addr']")
		WebElement customeraddress;

		@FindBy(xpath="//input[@name='city']")
		WebElement customercity;

		@FindBy(xpath="//input[@name='state']")
		WebElement customerstate;

		@FindBy(xpath="//input[@name='pinno']")
		WebElement customerpin;
		
		@FindBy(xpath="//input[@name='telephoneno']")
		WebElement customermobile;
		
		@FindBy(xpath="//input[@name='emailid']")
		WebElement customeremail;

		@FindBy(xpath="//input[@name='password']")
		WebElement customeraddpassword;
		
		@FindBy(xpath="//input[@name='sub']")
		WebElement submit;
		
		
		
		//Action Methods
		public void setnew_customer()
		{
			new_customer.click();
		}
		public void setcustomername(String custname)
		{
			customername.sendKeys(custname);
		}
		public void setcustomerdd(String custdd)
		{
			customerdd.sendKeys(custdd);
		}
		public void setcustomermm(String custmm)
		{
			customermm.sendKeys(custmm);
		}
		public void setcustomeryyyy(String custyyyy)
		{
			customeryyyy.sendKeys(custyyyy);
		}
		public void setcustomeraddress(String custadd)
		{
			customeraddress.sendKeys(custadd);
		}
		public void setcustomercity(String custcity)
		{
			customercity.sendKeys(custcity);
		}
		public void setcustomerstate(String custstate)
		{
			customerstate.sendKeys(custstate);
		}
		public void setcustomerpin(String custpin)
		{
			customerpin.sendKeys(custpin);
		}
		public void setcustomermobile(String custmobile)
		{
			customermobile.sendKeys(custmobile);
		}
		public void setcustomeremail(String custemail)
		{
			customeremail.sendKeys(custemail);
		}
		public void setcustomeraddpassword(String custaddpass)
		{
			customeraddpassword.sendKeys(custaddpass);
		}
		public void setsubmit()
		{
			submit.click();
		}
		
		
		




}
