package com.myhybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AddCustomerPO;
import com.myhybridframework.pageObjects.LoginPO;

public class NewCustomer_BlankValidationDDFTC004 extends BaseClass {
	
	@Test(dataProvider="NewCustBlankValid")
	public void newcust_blankvalidation(String user, String pass,String name,String day,String month,String year,String add,String city,String state,String pin,String mob,String email,String password) throws Exception
	{
		driver.get(baseURL);
		
		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(user);
		loginpo.setPassword(pass);
		loginpo.setLoginBtn();
		
		AddCustomerPO addcustomerpo = new AddCustomerPO(driver);
	    //New Customer
		addcustomerpo.setnew_customer();
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Name
		addcustomerpo.setcustomername(name);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Date
		addcustomerpo.setcustomerdd(day);
		Thread.sleep(4000);
		//Month
		addcustomerpo.setcustomermm(month);
		//Year
		addcustomerpo.setcustomeryyyy(year);
		
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		//Add
		addcustomerpo.setcustomeraddress(add);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//CIty
		addcustomerpo.setcustomercity(city);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//State
		addcustomerpo.setcustomerstate(state);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Pin
		addcustomerpo.setcustomerpin(pin);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Mobile
		addcustomerpo.setcustomermobile(mob);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Email
		addcustomerpo.setcustomeremail(email);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Password
		addcustomerpo.setcustomeraddpassword(password);
		Thread.sleep(4000);
		addcustomerpo.setsubmit();
		
		
		
	}
		
	public boolean isAlertPresent(){
		
		try{
		
		driver.switchTo().alert();
		return true;
		}
		catch(Exception e)
		{
			
			return false;
			
		}
		
		
	}
	
	@DataProvider(name="NewCustBlankValid")
	public String[][] getaddcustomerData()       //method
	{

		String addcustomerdatadata[][]= {            //array name
				{"mngr487641","hYmYqym","rohit","01","01","2000","mgcity","pune","maharashtra","411057","9881577848","rohit001@gmail.com","Rohit@12345"}
				
		};
		return addcustomerdatadata;

}}
	
		
	
	
	
	
	
	
	
	
	
	
	