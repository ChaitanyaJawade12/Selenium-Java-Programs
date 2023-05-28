package com.myhybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
	
	WebDriver ldriver;
	
	public LoginPO(WebDriver rdriver) //creating constructor
	{
		ldriver=rdriver; //Equating driver
		PageFactory.initElements(rdriver, this);
	}
	
	//Find Selectors
	@FindBy(xpath="//input[@name='uid']") //locators and values
	WebElement txtusername; //declaring varable
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement btnlogout;
	
	//Action Methods
	public void setUsername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String upassword)
	{
		txtpassword.sendKeys(upassword);
	}
	
	public void setLoginBtn()
	{
		btnlogin.click();
	}
	public void setLogoutBtn()
	{
		btnlogout.click();
	}
	
	
	

}
